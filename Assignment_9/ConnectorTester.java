package consultadd.assignment9;

public class ConnectorTester {

	public static void main(String[] args) {
		
		ConnectorManager cm = new ConnectorManager();
		Connector connector;
		
		connector = new MsSQLConnection();
		cm.callMethods(connector);
		
		System.out.println();
		
		connector = new OracleConnector();
		cm.callMethods(connector);
		

	}

}
