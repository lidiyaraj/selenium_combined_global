package generics;

import java.time.LocalDateTime;


	public interface IAutoConstants {
		String EXCELPATH="./src/test/resources/datatest.xlsx";
		String JDBC_URL="jdbc:mysql://localhost:3306/advaanceselenium";
		String JDBC_UN="root";
		String JDBC_PWD="root";
		String PROPERTYFILEPATH="./src/test/resources/commondata.properties";
		String SSPATH="./errorshot/";
		String TIME=LocalDateTime.now().toString().replace(":","-");
		String DIRECTORY=System.getProperty("user.dir");
		String EXCELPATH1="./src/test/resources/data_2.xlsx";

	}



