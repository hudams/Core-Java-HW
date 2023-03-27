package hw11Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		ColumbiaUniversity.columVersity();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.anatomhyLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.commonRoom();
		columbiaUniversity.labratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeyRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.lawInfo();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.gymnasium();
		columbiaUniversity.caring();
		columbiaUniversity.Maths();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.computerLab();
		columbiaUniversity.anthropology();

		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		// Calling static method from University interface by Interface name. Calling by object is not allowed for static method
		University.library();
		// Static method from College interface is not allowed to call by object or Interface even though University interface extends College interface
		// University.studyRoom();
		university.commonRoom();
		university.labratory();
		university.languageClub();
		university.dorm();
		university.emergencyRoom();
		university.surgeyRoom();
		university.cafeteria();
		university.morgue();

		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.biochemistryLab();
		MedicalSchool.medSchool();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.lawInfo();

	}

}
