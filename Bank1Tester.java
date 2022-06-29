class Bank1Tester {

      public static void main(String []a)  {
  
          Bank1 kotak = new KotakBank();
          kotak.getInterest(5.0);
                
		  Bank1 axis = new AxisBank();
          axis.getInterest(6.0);
 
          Bank1 canara = new CanaraBank();
          canara.getInterest(4.5);

          Bank1 seethaBank = new SeethaBank();
          seethaBank.getInterest(5.2);

          Bank1 sbi = new SbiBank();
          sbi.getInterest(5.75);

          Bank1 rbl = new RblBank();
          rbl.getInterest(6.65);

          Bank1 hdfc = new HdfcBank();
          hdfc.getInterest(5.75);

          Bank1 bankOfBaroda = new BankOfBaroda();
          bankOfBaroda.getInterest(6.65);

          Bank1 bankOfIndia = new BankOfIndia();
          bankOfIndia.getInterest(5.5);
 
          Bank1 idbi = new IdbiBank();
          idbi.getInterest(5.6);		  
        
    }
  }
