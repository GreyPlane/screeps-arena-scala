import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should._

class MainSpec extends AnyWordSpec with Matchers with TypeCheckedTripleEquals {
	"tests" should {
		"work" in {
			55 should === (55)
		}
	}
}