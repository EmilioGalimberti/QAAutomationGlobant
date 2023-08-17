
import service.ServiceDog;
import service.ServicePerson;

public class Main {
    public static void main(String[] args) {
        ServicePerson servicePerson = new ServicePerson();
        servicePerson.createPerson();
        servicePerson.showPeople();
        ServiceDog serviceDog = new ServiceDog();
        serviceDog.createDog();
        serviceDog.showDogs();
        servicePerson.adoptDog("emilio","asd", serviceDog.getDogs());
        servicePerson.showPeople();
    }
}


/*
 asosicacion simple https://www.youtube.com/watch?v=B77GzLpkX30&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2&index=2
 composicion https://www.youtube.com/watch?v=8zZni1kKRBE&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2&index=2
 agrecacion https://www.youtube.com/watch?v=6xTngktXc-0&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2&index=3
 asociacion inversa o bidireccional https://www.youtube.com/watch?v=CABO9q6d_Y0&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2&index=4
 asociaicon reflexiva https://www.youtube.com/watch?v=CABO9q6d_Y0&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2&index=4
 */