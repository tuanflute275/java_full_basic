public class TinhToan {
    private float a;
    private float b;

    public TinhToan(float a, float b) {
        this.a = a;
        this.b = b;
    }


    public float getNumberA() {
        return this.a;
    }

    public void setNumberA(float a) {
        if(a > 0)
            this.a = a;
    }

    public float getNumberB(){
        return this.b;
    }

    public void setNumberB(float b){
        if(a > 0)
            this.b = b;
    }

    @Override
    public String toString() {
        return "TinhToan{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public float TinhTong(){
        return this.a + this.b;
    }

    public float TinhHieu(){
        return this.a - this.b;
    }

    public float TinhTich(){
        return this.a * this.b;
    }

    public float TinhThuong(){
        return this.a / this.b;
    }

    public float chuViHcn(){
        return (this.a + this.b)*2;
    }

    public float DienTichHcn(){
        return this.a * this.b;
    }
}
