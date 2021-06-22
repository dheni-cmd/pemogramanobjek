public class Pekerjaparttime  extends Pegawaikasir{
    private String pendidikanterakhir;
    private String homebase;
    private String alasankerjaparttime;

    public void melamar(){
        System.out.println("untuk melamar kerja");
    }
    public void diseleksi(){
        System.out.println("interview untuk kerja part time");

    }


    @Override
    public String getPendidikanterakhir() {
        return pendidikanterakhir;
    }

    @Override
    public void setPendidikanterakhir(String pendidikanterakhir) {
        this.pendidikanterakhir = pendidikanterakhir;
    }

    public String getHomebase() {
        return homebase;
    }

    public void setHomebase(String homebase) {
        this.homebase = homebase;
    }

    public String getAlasankerjaparttime() {
        return alasankerjaparttime;
    }

    public void setAlasankerjaparttime(String alasankerjaparttime) {
        this.alasankerjaparttime = alasankerjaparttime;
    }
}
