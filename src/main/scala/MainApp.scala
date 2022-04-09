import scala.scalajs.js.JSON
import scala.scalajs.js.annotation.JSExportTopLevel

object MainApp extends App {

  @JSExportTopLevel("loop")
  def main(): Unit = {
    import facade.Game.utils._
    import facade.Game.constants._
    import facade.Game.prototypes._
    println(s"current ticks: ${getTicks()}")

    val creepsOpt = getObjectsByPrototype(Creep)
    creepsOpt.foreach(creeps => {
      val (myCreeps, enemies) = creeps.toList.partition(_.my)
      val enemy = enemies.head
      println(s"enemy ${JSON.stringify(enemy)}")
      myCreeps.groupBy(_.body.head.`type`).foreach {
        case (RANGED_ATTACK, creeps) => creeps.foreach(creep => {
            println(s"${JSON.stringify(creep)} rangedAttacking")
            val code = creep.rangedAttack(enemy)
            if (code == ERR_NOT_IN_RANGE) { creep.moveTo(enemy) }
          })

        case (HEAL, creeps) => creeps.foreach(creep => {
            myCreeps.find(creep => creep.hits < creep.hitsMax).foreach(damagedCreep => {
              if (creep.heal(damagedCreep) == ERR_NOT_IN_RANGE) { creep.moveTo(damagedCreep) }
            })
          })
        case (ATTACK, creeps) => creeps.foreach(creep => {
            println(s"${JSON.stringify(creep)} attacking")
            if (creep.attack(enemy) == ERR_NOT_IN_RANGE) { creep.moveTo(enemy) }
          })
        case (_, creep) =>
          println(JSON.stringify(creep))
          None
      }
    })
  }

}
