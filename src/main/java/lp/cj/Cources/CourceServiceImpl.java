package lp.cj.Cources;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CourceServiceImpl implements CourceService {

    private CourceUtil courceUtil;

    public CourceServiceImpl() {
        courceUtil = new CourceUtil();
    }

    @Override
    public List<CourceDTO> getCourceStats() {

        List<CourceDTO> list = new ArrayList<>();

        try {
            List<Cource> cources = courceUtil.getCources(new File(this.getClass().getResource("/Cource_data.csv").getFile()).toPath());
            List<Student> students = courceUtil.getStudents(new File(this.getClass().getResource("/Student_data.csv").getFile()).toPath());
            List<Trainer> trainers = courceUtil.getTrainers(new File(this.getClass().getResource("/Trainer_data.csv").getFile()).toPath());
            List<StudentCource> studentCources = courceUtil.getStudentCource(new File(this.getClass().getResource("/student_cource.csv").getFile()).toPath());
            List<CourceTrainer> CourceTrainer = courceUtil.getCourceTrainer(new File(this.getClass().getResource("/cource_trainer.csv").getFile()).toPath());


            for (Cource cource : cources) {
                String cource_id = String.valueOf(cource.getCource_id());
                String Cname = cource.getCname();
                String fee = String.valueOf(cource.getFee());
                String Tname = null;
                int Scount = 0;
                for (CourceTrainer courceTr : CourceTrainer) {
                    if (courceTr.cource_id == Integer.parseInt(cource_id)) {
                        String train_id = String.valueOf(courceTr.getTrainer_id());
                        for (Trainer trainer : trainers) {
                            if (trainer.trainer_id == Integer.parseInt(train_id)) {
                                Tname = trainer.Tname;
                            }
                        }
                    }
                }
                for (StudentCource studCource : studentCources) {
                    if (studCource.cource_id == Integer.parseInt(cource_id)) {
                        Scount = Scount + 1;
                    }
                }

                CourceDTO courceDTO = CourceDTO.builder()
                        .cource_id(cource_id)
                        .Cname(Cname)
                        .Tname(Tname)
                        .fee(Double.parseDouble(fee))
                        .Scount(Scount)
                        .build();
                list.add(courceDTO);


            }

        }catch(IOException e){
            throw new RuntimeException(e);
        }
        return list;
    }
   /* public static void main (String[]args){
        new CourceServiceImpl().getCourceStats();
    }*/

    public List<CourceDTO> getTrainStarts(){
        List<CourceDTO> list = new ArrayList<>();

        try {
            List<Cource> cources = courceUtil.getCources(new File(this.getClass().getResource("/Cource_data.csv").getFile()).toPath());
            List<Student> students = courceUtil.getStudents(new File(this.getClass().getResource("/Student_data.csv").getFile()).toPath());
            List<Trainer> trainers = courceUtil.getTrainers(new File(this.getClass().getResource("/Trainer_data.csv").getFile()).toPath());
            List<StudentCource> studentCources = courceUtil.getStudentCource(new File(this.getClass().getResource("/student_cource.csv").getFile()).toPath());
            List<CourceTrainer> CourceTrainer = courceUtil.getCourceTrainer(new File(this.getClass().getResource("/cource_trainer.csv").getFile()).toPath());


            for (Trainer trainer:trainers){
                String trainer_id = String.valueOf(trainer.getTrainer_id());
                String Tname = trainer.getTname();
                int Scount = 0;
                int Ccount = 0;
                for (CourceTrainer crTrainer:CourceTrainer){
                    if (crTrainer.getTrainer_id() == Integer.parseInt(trainer_id)){
                        String cource_id = String.valueOf(crTrainer.getCource_id());
                        Ccount = Ccount + 1;
                        for (StudentCource studentCrce:studentCources){
                            if (studentCrce.getCource_id() == Integer.parseInt(cource_id)){
                                Scount = Scount + 1;
                            }
                        }
                    }
                }

                CourceDTO courceDTO = CourceDTO.builder()
                        .trainer_id(trainer_id)
                        .Tname(Tname)
                        .Scount(Scount)
                        .Ccount(Ccount)
                        .build();
                list.add(courceDTO);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<CourceDTO> courceAlLStudentsimpl(){
        List<CourceDTO> listStdents = new ArrayList<>();
        try{
            List<Cource> cources = courceUtil.getCources(new File(this.getClass().getResource("/Cource_data.csv").getFile()).toPath());
            List<Student> students = courceUtil.getStudents(new File(this.getClass().getResource("/Student_data.csv").getFile()).toPath());
            List<Trainer> trainers = courceUtil.getTrainers(new File(this.getClass().getResource("/Trainer_data.csv").getFile()).toPath());
            List<StudentCource> studentCources = courceUtil.getStudentCource(new File(this.getClass().getResource("/student_cource.csv").getFile()).toPath());
            List<CourceTrainer> CourceTrainer = courceUtil.getCourceTrainer(new File(this.getClass().getResource("/cource_trainer.csv").getFile()).toPath());


            for (Cource cource: cources) {
                String cource_id = String.valueOf(cource.getCource_id());
                String Cname = cource.getCname();
                String Tname = null;
                for (CourceTrainer crTrainer : CourceTrainer) {
                    if (crTrainer.getCource_id() == Integer.parseInt(cource_id)) {
                        String trainer_id = String.valueOf(crTrainer.getTrainer_id());
                        for (Trainer trainer : trainers) {
                            if (trainer.getTrainer_id() == Integer.parseInt(trainer_id)) {
                                Tname = trainer.getTname();
                            }
                        }
                    }
                }
                List<String> names = new ArrayList<>();
                for (StudentCource stCource : studentCources) {
                    if (stCource.cource_id == Integer.parseInt(cource_id)) {
                        String student_id = String.valueOf(stCource.getStudent_id());
                        for (Student student : students) {
                            if (student.student_id == Integer.parseInt(student_id)) {
                                String Sname = student.getSname();
                                names.add(Sname);
                            }
                        }
                    }
                }
                CourceDTO courceDTO = CourceDTO.builder()
                        .cource_id(cource_id)
                        .Cname(Cname)
                        .Tname(Tname)
                        .names(names)
                        .build();
                listStdents.add(courceDTO);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listStdents;
    }

}
