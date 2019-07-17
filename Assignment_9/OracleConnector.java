package consultadd.assignment9;

public class OracleConnector extends Connector {

	@Override
	public void openConnection() {
		System.out.println("OracleConnector: Inside openConnection");
	}

	@Override
	public void closeConnection() {
		System.out.println("OracleConnector: Inside closeConnection");
	}

	@Override
	public void fireQuery() {
		System.out.println("OracleConnector: Inside fireQuery");
	}

}
