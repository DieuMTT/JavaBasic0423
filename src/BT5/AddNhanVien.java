package BT5;

import java.util.ArrayList;

public class AddNhanVien {
    private String name;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public AddNhanVien(String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Nhanvien@[name=" + name + ", role=" + role + "]";
    }

    public static void main(String[] args) {
        // Create listStudent
        ArrayList<AddNhanVien> listNhanVien = new ArrayList<AddNhanVien>();
        // Create students &  Add objects to listStudent
        listNhanVien.add(new AddNhanVien("Dieu", "Tester"));
        listNhanVien.add(new AddNhanVien("Nam", "Dev"));
        listNhanVien.add(new AddNhanVien("Lan", "BA"));
        // Show listStudent
//        for (AddNhanVien nhanvien : listNhanVien) {
//            System.out.println(nhanvien.toString());
//        }
        for (int i = 0; i <= listNhanVien.size(); i++) {
            System.out.println(listNhanVien.get(i).toString());
        }
    }
}
