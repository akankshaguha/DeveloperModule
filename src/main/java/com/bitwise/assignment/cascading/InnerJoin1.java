package com.bitwise.assignment.cascading;

import cascading.pipe.CoGroup;
import cascading.pipe.Pipe;
import cascading.pipe.SubAssembly;
import cascading.pipe.joiner.InnerJoin;
import cascading.tuple.Fields;

public class InnerJoin1 extends SubAssembly {
	 public InnerJoin1(Pipe sourcePipe1, Pipe sourcePipe2) {
          setPrevious(sourcePipe1,sourcePipe2);

            Pipe join = new CoGroup(sourcePipe1,
                    new Fields("acc_no","name","dob","phone_no"),sourcePipe2,
                    new Fields("acc_no1","trans_type","trans_amt","trans_date"),new InnerJoin());
            setTails(join);
     }
}
//only this subassembly to be tested within this file
