package Session2;

public class pertemuan_2 {
    public static void main(String[] args){
        Integer a = -7;
        int b = Integer.MAX_VALUE;
        String str = new String("Hello World!");
        System.out.println(Math.abs(a));
        System.out.println(Math.floor(500 + Math.random() * 501));
        System.out.println(str == "Hello World!");
        System.out.println(str.equals("Hello World!"));
        String c[] = str.split(" ");
        System.out.println(c[0]);
        System.out.println(str.contains("Wo"));
        char kata[] = str.toCharArray();
        kata[6] = 'w';
        System.out.println(kata);

        /*
        di java pengganti getchar(); itu scan.nextLine();
        supaya karakter enter bisa diambil dan variabel selanjutnya bisa kebaca

        kalau mau print tepat 3 angka harus ditambahi di % nya
        contoh : %03d -> ini artinya ditambahi angka 0 jika belum tepat 3 karakter outputnya
         */
    }
}
