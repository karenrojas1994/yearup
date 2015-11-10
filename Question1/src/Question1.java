public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) 
 {

 

    boolean answerCell = true;


     if (!isAsleep)

    { 

if (isMorning)

{

                                if (!isMom)

                                {

                                                answerCell =false;

                                }

}

   }

   else

  {

answerCell = false;
   }

}
