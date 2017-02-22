package guava;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.Map;
import java.util.Set;

/**
 * <p>文件名称：TableTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/17 </p>
 *
 * @author wangqiming
 */
public class TableTest {

    public static void main(String[] args) {
        Table<String, String, String> employeeTable = HashBasedTable.create();
        employeeTable.put("IBM", "101", "Mahesh");
        employeeTable.put("IBM", "102", "Ramesh");
        employeeTable.put("IBM", "103", "Suresh");

        employeeTable.put("Microsoft", "111", "Sohan");
        employeeTable.put("Microsoft", "112", "Mohan");
        employeeTable.put("Microsoft", "113", "Rohan");

        employeeTable.put("TCS", "121", "Ram");
        employeeTable.put("TCS", "122", "Shyam");
        employeeTable.put("TCS", "123", "Sunil");

        System.out.println("size: " + employeeTable.size());
        System.out.println("key1111: " + employeeTable.rowKeySet());

        Map<String, String> ibmEmployees = employeeTable.row("IBM");

        //get Map corresponding to IBM
        System.out.println("List of IBM Employees");
        for (Map.Entry<String, String> entry : ibmEmployees.entrySet()) {
            System.out.println("Emp Id: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        //get all the unique keys of the table
        Set<String> employers = employeeTable.rowKeySet();
        System.out.println("Employers: ");
        for (String employer : employers) {
            System.out.println(employer + ",");
        }

        Map<String,String> employerMap = employeeTable.column("102");
        for (Map.Entry<String,String> entry: employerMap.entrySet()) {
            System.out.println("Employer: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
