package consultadd.assignment9;

public class ConnectorManager {

	public void callMethods(Connector connector) {
		
		connector.display();
		connector.loadedDBConnection();
		
		if(connector instanceof MsSQLConnection) {
			((MsSQLConnection)connector).openConnection();
			((MsSQLConnection)connector).fireQuery();
			((MsSQLConnection)connector).closeConnection();
		}
		
		else if(connector instanceof OracleConnector) {
			((OracleConnector)connector).openConnection();
			((OracleConnector)connector).fireQuery();
			((OracleConnector)connector).closeConnection();
		}
		
	}

}
