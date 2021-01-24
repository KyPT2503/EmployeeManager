package model;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileController implements ReadFileAble, WriteFileAble {
    private final static String FILE_PATH = "";
    private File file;

    public FileController() {
        this.file = new File(FILE_PATH);
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = new LinkedList<>();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Employee employee = null;
            while ((employee = (Employee) objectInputStream.readObject()) != null) {
                employees.add(employee);
            }
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return employees;
    }

    @Override
    public boolean saveEmployees(List<Employee> employees) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            for (Employee employee : employees) {
                objectOutputStream.writeObject(employee);
            }

            objectOutputStream.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
