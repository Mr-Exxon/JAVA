/*********************************
 * @author Mufadhal Faraz Addhifa*
 *********************************/
package College;

class enums {
    /**
     * @param args the command line arguments
     */
        
        private int minum;
        enum drink  
         //Class Enum dengan Variable yang Nilainya sudah Didefinisikan
        {
        Milk_Tea, Brown_Sugar, Fresh_Milk, Coffee
        //final int milk_Tea=30000, Brown_Sugar=28000, Fresh_Milk=33000, Coffee=25000;
        }
        //Sebuah Konstrukor dari Enum dengan Parameter String

        public void setMinum(int minum) {
            this.minum = minum;
        }

        public int getMinum() {
            return minum;
        }
           
    public static void main(String[] args){
        //Objek Array Untuk Menghitung Jumlah Valeu pada HEWAN
        drink arr[] = drink.values();
        //Melooping serta Mencetak semua Nilai Pada Enum
        for(drink Minum : arr)
            System.out.println(Minum);
        
    }
}

