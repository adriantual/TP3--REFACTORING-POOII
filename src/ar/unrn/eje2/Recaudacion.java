package ar.unrn.eje2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;

public class Recaudacion {
	public static List<Map<String, String>> where(Map<String, String> options) throws IOException {
		List<String[]> csvData = new ArrayList<String[]>();
		CSVReader reader = new CSVReader(new FileReader("data.csv"));
		String[] row = null;

		while ((row = reader.readNext()) != null) {
			csvData.add(row);
		}

		reader.close();
		csvData.remove(0);

		if (options.containsKey("company_name")) {
			// filtro(c, null)

			List<String[]> results = new ArrayList<String[]>();

			// String string : csvData
			results = filtro(new Condicion() {

				@Override
				public boolean condicion(String[] elemento) {
					// TODO Auto-generated method stub
					return elemento[4].equals(options.get("company_name"));
				}
			}, csvData);
			csvData = results;
		}

		if (options.containsKey("city")) {

			List<String[]> results = new ArrayList<String[]>();

			/*
			 * for (int i = 0; i < csvData.size(); i++) { if
			 * (csvData.get(i)[4].equals(options.get("city"))) {
			 * results.add(csvData.get(i)); } }
			 */
			results = filtro(new Condicion() {

				@Override
				public boolean condicion(String[] elemento) {
					// TODO Auto-generated method stub
					return elemento[4].equals(options.get("city"));
				}
			}, csvData);
			csvData = results;
		}

		if (options.containsKey("state")) {
			List<String[]> results = new ArrayList<String[]>();

			/*
			 * for (int i = 0; i < csvData.size(); i++) { if
			 * (csvData.get(i)[5].equals(options.get("state"))) {
			 * results.add(csvData.get(i)); } }
			 */
			results = filtro(new Condicion() {

				@Override
				public boolean condicion(String[] elemento) {
					// TODO Auto-generated method stub
					return elemento[5].equals(options.get("state"));
				}
			}, csvData);

		}

		if (options.containsKey("round")) {
			List<String[]> results = new ArrayList<String[]>();

			results = filtro(new Condicion() {

				@Override
				public boolean condicion(String[] elemento) {
					// TODO Auto-generated method stub
					return elemento[5].equals(options.get("round"));
				}
			}, csvData);
		}

		List<Map<String, String>> output = new ArrayList<Map<String, String>>();

		for (int i = 0; i < csvData.size(); i++) {
			Map<String, String> mapped = new HashMap<String, String>();
			mapped.put("permalink", csvData.get(i)[0]);
			mapped.put("company_name", csvData.get(i)[1]);
			mapped.put("number_employees", csvData.get(i)[2]);
			mapped.put("category", csvData.get(i)[3]);
			mapped.put("city", csvData.get(i)[4]);
			mapped.put("state", csvData.get(i)[5]);
			mapped.put("funded_date", csvData.get(i)[6]);
			mapped.put("raised_amount", csvData.get(i)[7]);
			mapped.put("raised_currency", csvData.get(i)[8]);
			mapped.put("round", csvData.get(i)[9]);
			output.add(mapped);
		}

		return output;
	}

	private static List<String[]> filtro(Condicion unaCondicion, List<String[]> csv) {
		List<String[]> results = new ArrayList<String[]>();

		for (int i = 0; i < csv.size(); i++) {
			if (unaCondicion.condicion(csv.get(i))) {
				results.add(csv.get(i));
			}
		}
		return results;
	}

	/*
	 * public static void main(String[] args) { try { Map<String, String> options =
	 * new HashMap<String, String>(); options.put("company_name", "Facebook");
	 * options.put("round", "a");
	 * System.out.print(Recaudacion.where(options).size()); } catch (IOException e)
	 * { System.out.print(e.getMessage()); System.out.print("error"); } }
	 */
}

class NoSuchEntryException extends Exception {
}
