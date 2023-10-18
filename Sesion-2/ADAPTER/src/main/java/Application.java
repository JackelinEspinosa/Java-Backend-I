public class Application {

    public static void main(String[] args) throws Exception {
      // Crear una instancia de 'StockMarketAdapter' que implementa 'StockMarketReport'
      StockMarketReport report = new StockMarketAdapter();
  
      // Descargar datos del mercado de valores y convertirlos a JSON
      String json = report.download();
  
      // Crear una instancia de 'AnalysisLibrary' para analizar información
      AnalysisLibrary library = new AnalysisLibrary();
  
      // Analizar la información en formato JSON
      library.analyzeInformation(json);
    }
  }