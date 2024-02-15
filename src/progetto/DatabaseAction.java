package progetto;

import progetto.prodotti.Prodotti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseAction {
    private static DatabaseAction instance;
    private String url;
    private String username;
    private String password;

    private DatabaseAction() {
        this.url = "url";
        this.username = "username";
        this.password = "password";
    }

    public static DatabaseAction getInstance() {
        if (instance == null) {
            instance = new DatabaseAction();
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void insertRistorante(Ristorante ristorante) {
        String insertQuery = "INSERT INTO ristorante (id, nome_ristorante, indirizzo, max_posti) VALUES (?, ?, ?, ?)";
        try {
                Connection connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connected to the database!");

                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

                preparedStatement.setInt(1, ristorante.getId());
                preparedStatement.setString(2, ristorante.getNome());
                preparedStatement.setString(3, ristorante.getIndirizzo());
                preparedStatement.setInt(4, ristorante.getNumMaxPosti());

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " row(s) inserted successfully!");

                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Insertion failed. Error: " + e.getMessage());
        }
    }

    public void insertMenu(Menu menu, RegistroRistoranti registroRistoranti) {
        String insertQuery = "INSERT INTO menu (id, nome_menu, tipo_menu, ristorante_id) VALUES (?, ?, ?, ?)";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setInt(1, menu.getId());
            preparedStatement.setString(2, menu.getNomeMenu());
            preparedStatement.setString(3, menu.getTipoMenu().getTipoMenu());
            preparedStatement.setInt(4, registroRistoranti.getMenuIdRistorante(menu));

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted successfully!");

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Insertion failed. Error: " + e.getMessage());
        }
    }

    public void insertProdotto(Prodotti prodotti, RegistroRistoranti registroRistoranti) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("INSERT INTO ");
        stringBuilder.append(prodotti.getPortata().getPortata());
        stringBuilder.append("(id, nome, prezzo, menu_id) VALUES (?, ?, ?, ?)");
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            PreparedStatement preparedStatement = connection.prepareStatement(String.valueOf(stringBuilder));

            preparedStatement.setInt(1, prodotti.getId());
            preparedStatement.setString(2, prodotti.getNomePiatto());
            preparedStatement.setInt(3, prodotti.getPrezzo().intValue());
            preparedStatement.setInt(4, registroRistoranti.getportataIdMenu(prodotti));

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted successfully!");

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Insertion failed. Error: " + e.getMessage());
        }
    }

    public void insertCliente(Cliente cliente) {
        String insertQuery = "INSERT INTO clienti (id, nome, tipo_menu) VALUES (?, ?, ?)";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setInt(1, cliente.getId());
            preparedStatement.setString(2, cliente.getNome());
            preparedStatement.setString(3, cliente.getMenuPreferito().getTipoMenu());

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted successfully!");

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Insertion failed. Error: " + e.getMessage());
        }
    }

    public void insertPrenotazione(Prenotazione prenotazione, RegistroRistoranti registroRistoranti) {
        String insertQuery = "INSERT INTO prenotazione (id, nome_cliente, coperti, id_cliente, id_ristorante) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setInt(1, prenotazione.getId());
            preparedStatement.setString(2, prenotazione.getClientePrenotazione().getNome());
            preparedStatement.setInt(3, prenotazione.getCoperti());
            preparedStatement.setInt(4, prenotazione.getClientePrenotazione().getId());
            preparedStatement.setInt(5, registroRistoranti.getPrenotazioneIdRistorante(prenotazione));

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted successfully!");

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Insertion failed. Error: " + e.getMessage());
        }
    }

}
