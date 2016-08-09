package com.bitwise.assignment.cascading;

import cascading.operation.Identity;
import cascading.pipe.CoGroup;
import cascading.pipe.Each;
import cascading.pipe.Pipe;
import cascading.pipe.SubAssembly;
import cascading.tuple.Fields;

public class InnerJoin1 extends SubAssembly{

    public InnerJoin1(Pipe sourcePipe1, Pipe sourcePipe2) {
        setPrevious(sourcePipe1);
        setPrevious(sourcePipe2);

        Pipe pipe1 = new Each(sourcePipe1,new Fields("acc_no","name","dob","phone_no"),new Identity());

        Pipe  pipe2 = new Each(sourcePipe2,new Fields("acc_no1","trans_type","trans_amt","trans_date"),new Identity());

        Pipe join = new CoGroup(pipe1,pipe2);

        // Pipe join1 = new Each(join,new Identity());
        setTails(join);

    }
}