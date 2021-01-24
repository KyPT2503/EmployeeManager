package model;

import java.io.File;
import java.util.List;

public class ReadFile extends FileController {
    public List<Employee> execute() {
        return super.getEmployees();
    }
}
