package org.infinispan.statetransfer;

import org.infinispan.configuration.cache.CacheMode;
import org.infinispan.test.fwk.CleanupAfterMethod;
import org.testng.annotations.Test;

/**
 * @author anistor@redhat.com
 * @since 5.2
 */
@Test(groups = "functional", testName = "statetransfer.DistNonTxOperationsDuringStateTransferTest")
@CleanupAfterMethod
public class DistNonTxOperationsDuringStateTransferTest extends BaseOperationsDuringStateTransferTest {

   public DistNonTxOperationsDuringStateTransferTest() {
      super(CacheMode.DIST_SYNC, false, false);
   }
}
