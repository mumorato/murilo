package br.com.ifprbiopark.lpconexaomavensqlite;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoExercicio {

    public static void main(String[] args) {

        metodoConexao();

    }

    public static void metodoConexao() {
        try {

            Connection c = DriverManager.getConnection("jdbc:sqlite:LPexercicio1.db");
            Statement stm = c.createStatement();

            // criando uma tabela
            stm.execute("CREATE TABLE IF NOT EXISTS estado (id integer primary key, nome VARCHAR(50), sigla VARCHAR(2))");
            stm.execute("CREATE TABLE IF NOT EXISTS cidade(id integer primary key,nome varchar(50), estado_id integer references estado(id))");
            stm.execute("CREATE TABLE IF NOT EXISTS tipotitulo(id integer primary key,nome varchar(50))");

            // populando a tabela            
            stm.execute("insert into estado (id, nome, sigla) VALUES (1, 'Acre', 'AC');\n"
                    + "insert into estado (id, nome, sigla) VALUES (2, 'Alagoas', 'AL');\n"
                    + "insert into estado (id, nome, sigla) VALUES (3, 'Amapá', 'AP');\n"
                    + "insert into estado (id, nome, sigla) VALUES (4, 'Amazonas', 'AM');\n"
                    + "insert into estado (id, nome, sigla) VALUES (5, 'Bahia', 'BA');\n"
                    + "insert into estado (id, nome, sigla) VALUES (6, 'Ceará', 'CE');\n"
                    + "insert into estado (id, nome, sigla) VALUES (7, 'Distrito Federal', 'DF');\n"
                    + "insert into estado (id, nome, sigla) VALUES (8, 'Espírito Santo', 'ES');\n"
                    + "insert into estado (id, nome, sigla) VALUES (9, 'Goiás', 'GO');\n"
                    + "insert into estado (id, nome, sigla) VALUES (10, 'Maranhão', 'MA');\n"
                    + "insert into estado (id, nome, sigla) VALUES (11, 'Mato Grosso', 'MT');\n"
                    + "insert into estado (id, nome, sigla) VALUES (12, 'Mato Grosso do Sul', 'MS');\n"
                    + "insert into estado (id, nome, sigla) VALUES (13, 'Minas Gerais', 'MG');\n"
                    + "insert into estado (id, nome, sigla) VALUES (14, 'Pará', 'PA');\n"
                    + "insert into estado (id, nome, sigla) VALUES (15, 'Paraíba', 'PB');\n"
                    + "insert into estado (id, nome, sigla) VALUES (16, 'Paraná', 'PR');\n"
                    + "insert into estado (id, nome, sigla) VALUES (17, 'Pernambuco', 'PE');\n"
                    + "insert into estado (id, nome, sigla) VALUES (18, 'Piauí', 'PI');\n"
                    + "insert into estado (id, nome, sigla) VALUES (19, 'Rio de Janeiro', 'RJ');\n"
                    + "insert into estado (id, nome, sigla) VALUES (20, 'Rio Grande do Norte', 'RN');\n"
                    + "insert into estado (id, nome, sigla) VALUES (21, 'Rio Grande do Sul', 'RS');\n"
                    + "insert into estado (id, nome, sigla) VALUES (22, 'Rondônia', 'RO');\n"
                    + "insert into estado (id, nome, sigla) VALUES (23, 'Roraima', 'RR');\n"
                    + "insert into estado (id, nome, sigla) VALUES (24, 'Santa Catarina', 'SC');\n"
                    + "insert into estado (id, nome, sigla) VALUES (25, 'São Paulo', 'SP');\n"
                    + "insert into estado (id, nome, sigla) VALUES (26, 'Sergipe', 'SE');\n"
                    + "insert into estado (id, nome, sigla) VALUES (27, 'Tocantins', 'TO')");

            stm.execute("insert into cidade (id, nome, estado_id) values (1, 'Acrelândia', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (2, 'Assis Brasil', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (3, 'Brasiléia', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (4, 'Bujari', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (5, 'Capixaba', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (6, 'Cruzeiro Do Sul', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (7, 'Epitaciolândia', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (8, 'Feijó', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (9, 'Jordão', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (10, 'Mâncio Lima', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (11, 'Manoel Urbano', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (12, 'Marechal Thaumaturgo', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (13, 'Plácido De Castro', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (14, 'Porto Walter', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (15, 'Rio Branco', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (16, 'Rodrigues Alves', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (17, 'Santa Rosa Do Purus', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (18, 'Senador Guiomard', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (19, 'Sena Madureira', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (20, 'Tarauacá', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (21, 'Xapuri', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (22, 'Porto Acre', 1);\n"
                    + "insert into cidade (id, nome, estado_id) values (23, 'Água Branca', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (24, 'Anadia', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (25, 'Arapiraca', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (26, 'Atalaia', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (27, 'Barra De Santo Antônio', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (28, 'Barra De São Miguel', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (29, 'Batalha', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (30, 'Belém', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (31, 'Belo Monte', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (32, 'Boca Da Mata', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (33, 'Branquinha', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (34, 'Cacimbinhas', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (35, 'Cajueiro', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (36, 'Campestre', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (37, 'Campo Alegre', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (38, 'Campo Grande', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (39, 'Canapi', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (40, 'Capela', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (41, 'Carneiros', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (42, 'Chã Preta', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (43, 'Coité Do Nóia', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (44, 'Colônia Leopoldina', 2);\n"
                    + "insert into cidade (id, nome, estado_id) values (45, 'Coqueiro Seco', 2)");

            //Lendo registros
            String sql = "SELECT * FROM estado";
            PreparedStatement pstm = c.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                System.out.print("id: ");
                System.out.print(rs.getInt("id"));
                System.out.print("nome: ");
                System.out.println(rs.getString("nome"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ConexaoExercicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
