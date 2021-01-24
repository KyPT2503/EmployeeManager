package model;

import java.io.File;
import java.util.List;

public class WriteFile extends FileController {
    public boolean execute(List<Employee> employees) {
        return super.saveEmployees(employees);
    }
}
