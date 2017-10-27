package au.com.dius.pact.provider.junit

import au.com.dius.pact.model.Pact
import au.com.dius.pact.model.RequestResponsePact

open class RestPactRunner(clazz: Class<*>) : PactRunner(clazz) {
  override fun filterPacts(pacts: List<Pact>): List<Pact> {
    return pacts.filter { pact -> pact is RequestResponsePact }
  }
}
