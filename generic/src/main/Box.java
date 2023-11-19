package main;

public class Box <T>{
//    <T>  là đại diện cho kiểu dữ liệu truyền vào , chứ không có kdl nào là T cả
    // E: element
    // K: chìa khóa
    // N: Số
    // T: loại
    // V: giá trị
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
