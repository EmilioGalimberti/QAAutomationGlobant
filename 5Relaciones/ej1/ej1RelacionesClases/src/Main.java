
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