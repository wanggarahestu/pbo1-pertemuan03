package percabangan;

public class ModifikasiPercabangan {
    public static void main(String[] args) {
        boolean taatAturan = true;
        char nama='B';


        switch (nama){
            case 'A':
                System.out.println("Arif Putra, Tidak pernah membawa Kelengkapan Surat berkendara");
                break;
            default:
                System.out.println("Wangga Rahestu,Selalu membawa Surat STNK saat berkendara ");
                break;
        }
        if (taatAturan) {
            System.out.println("Maka Tidak Akan di tilang");  //true

        }else {
            System.out.println("Karena lalai maka akan kena sanksi oleh Polisi"); // false
        }

    }
}
