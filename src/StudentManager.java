public class StudentManager {
    private Student[] list = new Student[0];//Tạo mảng rỗng chứa danh sách sinh viên

    public void AddStudent(Student student) {
        //Tạo mảng tạm thời có kích thước lớn hơn mảng đang chứa danh sách để lưu thêm sinh viên
        Student[] tempList = new Student[list.length + 1];
        //Copy mảng cũ vào mảng mới
        for (int i = 0 ; i < list.length ; i++){
            tempList[i] = list[i];
        }
        //Gán sinh viên thêm vào cho phần tử cuối cùng của mảng mới
        int tempIndex = tempList.length - 1;
        tempList[tempIndex] = student;
        //Thay mảng cũ bằng mảng mới đã thêm sinh viên
        list = tempList;
    }

    public void EditStudent(Student student, int id) {
        int index = 0;
        boolean validId = false;
        //Trả về vị trí trong mảng của sinh viên qua Id, nếu không có thì thông báo invalid
        for (int i = 0; i < list.length; i++) {
            if (list[i].getId() == id) {
                index = i;
                validId = true;
            }
        }
        if (validId) {
            list[index].setAddress(student.getAddress());
            list[index].setAge(student.getAge());
            list[index].setGpa(student.getGpa());
            list[index].setId(student.getId());
            list[index].setName(student.getName());
        } else {
            System.out.println("Invalid Id");
        }
    }

    public void DeleteStudent(int id) {
        //Tạo mảng tạm thời có kích thước nhỏ hơn mảng chứa danh sách sinh viên
        Student[] tempList = new Student[list.length - 1];
        int tempIndex = 0;
        boolean validId = false;
        //Trả về vị trí của sinh viên qua Id
        for (int i = 0; i < list.length; i++) {
            if (list[i].getId() == id) {
                tempIndex = i;
                validId = true;
                break;
            }
        }
        if (validId) {
            for (int i = tempIndex; i < list.length - 1; i++) {
                list[i] = list[i + 1];
            }
            for (int i = 0; i < tempList.length; i++) {
                tempList[i] = list[i];
            }
            list = tempList;
        } else {
            System.out.println("Invalid ID");
        }
    }

    public void SortStudent() {
        Student temp = list[0];
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].getGpa() < list[j].getGpa()) {
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
    }

    public void ShowStudent() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getId() + "\t" + list[i].getName() + "\t" + list[i].getAge() + "\t" + list[i].getAddress() + "\t" + list[i].getGpa());
        }
    }
}

