package dao;

import model.Medico;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {

    public void inserir(Medico medico) {

        String sql =
                "INSERT INTO medico " +
                "(nome, crm, especialidade, telefone) " +
                "VALUES (?, ?, ?, ?)";

        Connection conn = Conexao.conectar();

        try {

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getCrm());
            stmt.setString(3,
                    medico.getEspecialidade());
            stmt.setString(4,
                    medico.getTelefone());

            stmt.execute();

            System.out.println(
                    "Médico cadastrado!"
            );

            stmt.close();
            conn.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public List<Medico> listar() {

        List<Medico> lista =
                new ArrayList<>();

        String sql =
                "SELECT * FROM medico";

        Connection conn =
                Conexao.conectar();

        try {

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            ResultSet rs =
                    stmt.executeQuery();

            while (rs.next()) {

                Medico medico =
                        new Medico();

                medico.setId(
                        rs.getInt("id")
                );

                medico.setNome(
                        rs.getString("nome")
                );

                medico.setCrm(
                        rs.getString("crm")
                );

                medico.setEspecialidade(
                        rs.getString(
                                "especialidade"
                        )
                );

                medico.setTelefone(
                        rs.getString("telefone")
                );

                lista.add(medico);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return lista;
    }

    public void atualizar(Medico medico) {

        String sql =
                "UPDATE medico SET " +
                "nome=?, crm=?, especialidade=?, telefone=? " +
                "WHERE id=?";

        Connection conn =
                Conexao.conectar();

        try {

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1,
                    medico.getNome());

            stmt.setString(2,
                    medico.getCrm());

            stmt.setString(3,
                    medico.getEspecialidade());

            stmt.setString(4,
                    medico.getTelefone());

            stmt.setInt(5,
                    medico.getId());

            stmt.execute();

            System.out.println(
                    "Médico atualizado!"
            );

            stmt.close();
            conn.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void excluir(int id) {

        String sql =
                "DELETE FROM medico WHERE id=?";

        Connection conn =
                Conexao.conectar();

        try {

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.execute();

            System.out.println(
                    "Médico removido!"
            );

            stmt.close();
            conn.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
