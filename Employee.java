package employe;
/**
 *
 * @author 
 * NAMA     : Dwi Ayu Lestari
 * PRODI    : PBO1
 * NIM      : 22166030
 * Deskripsi program :
 * 
 */
// superclass
public class Employee {
    private String name;

    // Konstruktor untuk nama Employee
    public Employee(String name) {
        this.name = name;
    }

    // Metode Employee untuk dapatkan nama
    public String getName() {
        return name;
    }

    // Metode menampilkan pekerjaan Employee
    public void work() {
        System.out.println("Beberapa Employee " + name + " sedang Bekerja: ");
    }
}

// subclass turunan Manager yang mewarisi Employee
class Manager extends Employee {
    // Konstruktor untuk nama Manager
    public Manager(String name) {
        super(name);
    }

    // Override metode work untuk menampilkan pekerjaan Manager
    @Override
    public void work() {
        System.out.println("1." + "Manager " + getName() + " sedang mengelola tugas.");
    }
}

// subclass turunan Developer yang mewarisi Employee
class Developer extends Employee {
    // Konstruktor untuk nama Developer
    public Developer(String name) {
        super(name);
    }

    // Override metode work untuk menampilkan pekerjaan Developer
    @Override
    public void work() {
        System.out.println("2." + "Developer " + getName() + " sedang Pengembangan code.");
    }
}

// subclass turunan Designer yang mewarisi Employee
class Designer extends Employee {
    // Konstruktor untuk  nama Designer
    public Designer(String name) {
        super(name);
    }

    // Override metode work untuk menampilkan pekerjaanDesigner
    @Override
    public void work() {
        System.out.println("3." + "Designer " + getName() + " sedang membuat desain.");
    }
}

// class main untuk menjalankan program
class Main {
    public static void main(String[] args) {
        // Membuat objek-objek dari berbagai jenis Employee
        Employee employee = new Employee("programmer");
        Manager manager = new Manager("Anisa");
        Developer developer = new Developer("Dwi Ayu");
        Designer designer = new Designer("Cahya");

        // Memanggil metode work untuk setiap objek
        employee.work();
        manager.work();
        developer.work();
        designer.work();
    }
}