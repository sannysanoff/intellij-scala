package org.jetbrains.plugins.scala.failed.resolve

import org.jetbrains.plugins.scala.PerfCycleTests
import org.junit.experimental.categories.Category

/**
  * @author Nikolay.Tropin
  */
@Category(Array(classOf[PerfCycleTests]))
class NamedArgumentTest extends FailedResolveTest("namedArgument") {

  def testSCL9926(): Unit = doTest() //apply method

  def testSCL10487(): Unit = doTest() //apply method

}
