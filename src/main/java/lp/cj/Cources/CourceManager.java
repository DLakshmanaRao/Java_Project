package lp.cj.Cources;


import java.util.List;

public class CourceManager {
    public static void main(String[] args) {
        CourceService courceService = new CourceServiceImpl();
        List<CourceDTO> list = courceService.getCourceStats();
        for (CourceDTO courceDTO : list) {
            System.out.println(String.format("Cource Id :  %s ------ Cource Name : %s ----- Trainer Name : %s " +
                    " ----- Fee : %s ----- Student count for cource : %s",courceDTO.getCource_id(), courceDTO.getCname(), courceDTO.getTname(),courceDTO.getFee(), courceDTO.getScount() ))  ;
        }
        System.out.println("\n\n");
        List<CourceDTO> listTr = courceService.getTrainStarts();
        for (CourceDTO courceDTO: listTr){
            System.out.println(String.format("Trainer Id : %s ---- Trainer Name : %s ----- Cource count : %s ---- Student count : %s",courceDTO.getTrainer_id(),courceDTO.getTname(),courceDTO.getCcount(),courceDTO.getScount())) ;
        }
    }
}
