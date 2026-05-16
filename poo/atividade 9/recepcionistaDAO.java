package dao;

import model.Recepcionista;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecepcionistaDAO {

    public void inserir(
            Recepcionista recepcionista
    ) {

        String sql =
                "INSERT INTO recepcionista " +
                "(nome, cpf, telefone, turno) " +
                "VALUES (?, ?, ?, ?)";

        Connection conn =
                Conexao.conectar();

        try {

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1,
                    recepcionista.getNome());

            stmt.setString(2,
                    recepcionista.getCpf());

            stmt.setString(3,
                    recepcionista.getTelefone());

            stmt.setString(4,
                    recepcionista.getTurno());

            stmt.execute();

            System.out.println(
                    "Recepcionista cadastrada!"
            );

            stmt.close();
            conn.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public List<Recepcionista> listar() {

        List<Recepcionista> lista =
                new ArrayList<>();

        String sql =
                "SELECT * FROM recepcionista";

        Connection conn =
                Conexao.conectar();

        try {

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            ResultSet rs =
                    stmt.executeQuery();

            while (rs.next()) {

                Recepcionista r =
                        new Recepcionista();

                r.setId(
                        rs.getInt("id")
                );

                r.setNome(
                        rs.getString("nome")
                );

                r.setCpf(
                        rs.getString("cpf")
                );

                r.setTelefone(
                        rs.getString("telefone")
                );

                r.setTurno(
                        rs.getString("turno")
                );

                lista.add(r);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return lista;
    }

    public void atualizar(
            Recepcionista recepcionista
    ) {

        String sql =
                "UPDATE recepcionista SET " +
                "nome=?, cpf=?, telefone=?, turno=? " +
                "WHERE id=?";

        Connection conn =
                Conexao.conectar();

        try {

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1,
                    recepcionista.getNome());

            stmt.setString(2,
                    recepcionista.getCpf());

            stmt.setString(3,
                    recepcionista.getTelefone());

            stmt.setString(4,
                    recepcionista.getTurno());

            stmt.setInt(5,
                    recepcionista.getId());

            stmt.execute();

            System.out.println(
                    "Recepcionista atualizada!"
            );

            stmt.close();
            conn.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void excluir(int id) {

        String sql =
                "DELETE FROM recepcionista WHERE id=?";

        Connection conn =
                Conexao.conectar();

        try {

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.execute();

            System.out.println(
                    "Recepcionista removida!"
            );

            stmt.close();
            conn.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
