public class LoadFromSQL implements LoadFromStorage {
    private Connection connection;

    public LoadFromSQL(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<String[]> loadData() {
        List<String[]> data = new ArrayList<>();
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT type, model FROM cars")) {

            while (rs.next()) {
                data.add(new String[]{rs.getString("type"), rs.getString("model")});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }
}
