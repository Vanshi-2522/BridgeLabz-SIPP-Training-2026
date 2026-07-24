package dsa.queues_deque;

import java.util.PriorityQueue;


class Patient {

    int priority;
    String name;


    Patient(int priority, String name) {

        this.priority = priority;
        this.name = name;
    }
}


public class HospitalTriage {


    PriorityQueue<Patient> patients;


    HospitalTriage() {

        // Min Heap
        patients = new PriorityQueue<>(
            (a,b) -> a.priority - b.priority
        );
    }


    void addPatient(Patient patient) {

        patients.offer(patient);
    }


    Patient callPatient() {

        return patients.poll();
    }



    public static void main(String[] args) {


        HospitalTriage hospital = new HospitalTriage();


        hospital.addPatient(new Patient(3,"John"));
        hospital.addPatient(new Patient(1,"Alice"));
        hospital.addPatient(new Patient(2,"David"));


        while(!hospital.patients.isEmpty()) {

            Patient p = hospital.callPatient();

            System.out.println(
                "Patient: " + p.name +
                " Priority: " + p.priority
            );
        }
    }
}
