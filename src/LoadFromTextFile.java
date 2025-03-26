public class LoadFromTextFile implements LoadFromStorage {
    private String filePath;

    public LoadFromTextFile(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<String[]> loadData() {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line.split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
