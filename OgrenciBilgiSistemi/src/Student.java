public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int matOral, int fizik, int fizikOral, int kimya, int kimyaOral) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (matOral >= 0 && matOral <= 100) {
            this.mat.oralExam = matOral;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (fizikOral >= 0 && fizikOral <= 100) {
            this.fizik.oralExam = fizikOral;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (kimyaOral >= 0 && kimyaOral <= 100) {
            this.kimya.oralExam = kimyaOral;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 ||this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note*this.fizik.writtenExamPerc + this.fizik.oralExam*(1.0-this.fizik.writtenExamPerc) + this.kimya.note*this.kimya.writtenExamPerc + this.kimya.oralExam*(1.0-this.kimya.writtenExamPerc) + this.mat.note*this.mat.writtenExamPerc + this.mat.oralExam*(1.0-this.mat.writtenExamPerc)) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.oralExam);
        System.out.println("Matematik yazılı sınavın nota etkisi :" + this.mat.writtenExamPerc );
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.oralExam);
        System.out.println("Fizik yazılı sınavın nota etkisi :" + this.fizik.writtenExamPerc );
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.oralExam);
        System.out.println("Kimya yazılı sınavın nota etkisi :" + this.kimya.writtenExamPerc );
    }

}