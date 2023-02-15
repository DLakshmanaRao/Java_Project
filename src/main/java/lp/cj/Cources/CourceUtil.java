package lp.cj.Cources;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CourceUtil {


    public List<Cource> getCources(Path path) throws IOException {
        List<String[]> list = readFromCSV(path,true);
        List<Cource> courceList = new ArrayList<>();
        for(String[] crr:list){
            Cource cource = Cource.builder()
                    .cource_id(Integer.parseInt(crr[0]))
                    .Cname(crr[1])
                    .fee(Double.parseDouble(crr[2]))
                    .build();
            courceList.add(cource);
        }
        return courceList;
    }

    public List<Student> getStudents(Path path) throws IOException {
        List<String[]> list = readFromCSV(path,true);
        List<Student> studentList = new ArrayList<>();
        for(String[] st:list){
            Student student = Student.builder()
                    .student_id(Integer.parseInt(st[0]))
                    .Sname(st[1])
                    .qualification(st[2])
                    .build();
            studentList.add(student);
        }
        return studentList;
    }


    public List<Trainer> getTrainers(Path path) throws IOException {
        List<String[]> list = readFromCSV(path,true);
        List<Trainer> trainerList = new ArrayList<>();
        for(String[] tr:list){
            Trainer trainer = Trainer.builder()
                    .trainer_id(Integer.parseInt(tr[0]))
                    .Tname(tr[1])
                    .qualification(tr[2])
                    .experience(tr[2])
                    .build();
            trainerList.add(trainer);
        }
        return trainerList;
    }

    public List<StudentCource> getStudentCource(Path path) throws IOException {
        List<String[]> list = readFromCSV(path,true);
        List<StudentCource> StudentCourceList = new ArrayList<>();
        for(String[] stCr:list){
            StudentCource stCource = StudentCource.builder()
                    .student_id(Integer.parseInt(stCr[0]))
                    .cource_id(Integer.parseInt(stCr[1]))
                    .build();
            StudentCourceList.add(stCource);
        }
        return StudentCourceList;
    }


    public List<CourceTrainer> getCourceTrainer(Path path) throws IOException {
        List<String[]> list = readFromCSV(path,true);
        List<CourceTrainer> CourceTrainerList = new ArrayList<>();
        for(String[] crTrn:list){
            CourceTrainer CrcTrainer = CourceTrainer.builder()
                    .cource_id(Integer.parseInt(crTrn[0]))
                    .trainer_id(Integer.parseInt(crTrn[1]))
                    .build();
            CourceTrainerList.add(CrcTrainer);
        }
        return CourceTrainerList;
    }



    private List<String[]> readFromCSV(Path filePath, boolean hasHeader) throws IOException {
        List<String[]> list = new ArrayList<>();
        try (Reader reader = Files.newBufferedReader(filePath)) {
            try (CSVReader csvReader = new CSVReader(reader)) {
                String[] line;
                while ((line = csvReader.readNext()) != null) {
                    list.add(line);
                }
            }
        }
        if (hasHeader) {
            return list.subList(1, list.size());
        }
        return list;
    }
}

