import service.ServiceMascota;



public class MascotaApp {

    public static void main(String[] args){
        //Arrays
//        String[] nombreArray = new String[5];
//
//        for (int i=0 ; i < nombreArray.length; i++){
//            nombreArray[i]= "Chiquito "+(i+1);
//        }
//
//        for (String var : nombreArray){
//            System.out.println(var);
//        }

        //Collections
//        ArrayList<String> nombreArrayList = new ArrayList<>();
//        System.out.println(nombreArrayList.size());
//        nombreArrayList.add("Chiquito");
//        System.out.println(nombreArrayList.size());
//        nombreArrayList.remove("Chiquito");
//        System.out.println(nombreArrayList.size());

        ServiceMascota serviceMascota = new ServiceMascota();
//        serviceMascota.crearMascota();
//        serviceMascota.crearMascota();
//        serviceMascota.mostrarMascotas();

        //serviceMascota.fabricaChiquitos(140);
        //serviceMascota.mostrarMascotas();
        serviceMascota.fabricaMascotas(2);
        serviceMascota.mostrarMascotas();
//        serviceMascota.actualizarMascota(0);
//        serviceMascota.actualizarApodoMascota(1);
//        serviceMascota.mostrarMascotas();
//        serviceMascota.eliminarPorNombre("emi");
//        serviceMascota.ordenar();
        serviceMascota.mostrarMascotas();
    }
}
