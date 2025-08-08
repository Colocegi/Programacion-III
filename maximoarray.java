public class maximoarray {  
    
    public static int encontrarmax(int[] array) {
        if (array.length == 0) {
            System.out.println("El array no puede estar vacío");
        }
        else {
            int maximo = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maximo) {
                    maximo = array[i];
                }
            }
            return maximo;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 9, 1, 5};
        int max = encontrarmax(nums);
        System.out.println("El máximo es: " + max);
    }
}