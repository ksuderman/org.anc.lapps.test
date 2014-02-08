package org.anc.lapps.test;

import org.lappsgrid.api.Data;
import org.lappsgrid.api.WebService;
import org.lappsgrid.core.DataFactory;
import org.lappsgrid.discriminator.Types;

/**
 * @author Keith Suderman
 */
public class TestWebService implements WebService
{
   public TestWebService()
   {

   }

   @Override
   public long[] requires()
   {
      return new long[] { Types.TEXT };
   }

   @Override
   public long[] produces()
   {
      return new long[] { Types.TEXT };
   }

   @Override
   public Data execute(Data input)
   {
      return DataFactory.text("execute");
   }

   @Override
   public Data configure(Data config)
   {
      return DataFactory.text("configure");
   }
}
