package template_pattern;

import template_pattern.subprocess.FirstKindProcess;
import template_pattern.subprocess.SecondKindProcess;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/13 18:01
 */
public class Main {

    public static void main(String [] args){

        FirstKindProcess firstKindProcess = new FirstKindProcess();
        firstKindProcess.process();
        SecondKindProcess secondKindProcess = new SecondKindProcess();
        secondKindProcess.process();
    }

}
