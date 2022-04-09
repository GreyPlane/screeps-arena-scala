package facade

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Game {

  @js.native
  trait RoomPosition extends js.Object {
    val x: Int = js.native
    val y: Int = js.native
  }

  @js.native
  trait GameObject extends RoomPosition {
    val exists: Boolean = js.native
    val id: String = js.native
    val ticksToDecay: Int = js.native

  }

  @js.native
  trait Structure extends GameObject {
    val hits: Int = js.native
    val hitsMax: Int = js.native
  }


  trait BodyPartDescriptor extends js.Object {
    val `type`: String
    val hits: Int
  }

  @js.native
  trait Creep extends GameObject {
    val body: js.Array[BodyPartDescriptor] = js.native
    val fatigue: Int = js.native
    val my: Boolean = js.native
    val hits: Int = js.native
    val hitsMax: Int = js.native
    def attack(target: Creep | Structure): Int = js.native
    def heal(target: Creep): Int = js.native
    def rangedAttack(target: Creep | Structure): Int = js.native

    def moveTo(target: RoomPosition, opts: Option[js.Object] = None): Int = js.native
  }

  @js.native
  trait Flag extends GameObject {
    val my: Boolean = js.native
  }

  @js.native
  @JSImport("/game/utils", JSImport.Namespace)
  object utils extends js.Object {
    def getTicks(): Int = js.native
    def getObjectsByPrototype[T <: GameObject](prototype: T): js.UndefOr[js.Array[T]] = js.native
  }

  @js.native
  @JSImport("/game/prototypes", JSImport.Namespace)
  object prototypes extends js.Object {
    @js.native
    object GameObject extends GameObject

    @js.native
    object Creep extends Creep

    @js.native
    object Flag extends Flag
  }

  @js.native
  @JSImport("/game/constants", JSImport.Namespace)
  object constants extends js.Object {
    val OK: Int = js.native
    val ERR_NOT_OWNER: Int = js.native
    val ERR_NO_PATH: Int = js.native
    val ERR_NAME_EXISTS: Int = js.native
    val ERR_BUSY: Int = js.native
    val ERR_NOT_FOUND: Int = js.native
    val ERR_NOT_ENOUGH_ENERGY: Int = js.native
    val ERR_NOT_ENOUGH_RESOURCES: Int = js.native
    val ERR_INVALID_TARGET: Int = js.native
    val ERR_FULL: Int = js.native
    val ERR_NOT_IN_RANGE: Int = js.native
    val ERR_INVALID_ARGS: Int = js.native
    val ERR_TIRED: Int = js.native
    val ERR_NO_BODYPART: Int = js.native
    val ERR_NOT_ENOUGH_EXTENSIONS: Int = js.native
    val ERR_RCL_NOT_ENOUGH: Int = js.native
    val ERR_GCL_NOT_ENOUGH: Int = js.native
    val FIND_EXIT_TOP: Int = js.native
    val FIND_EXIT_RIGHT: Int = js.native
    val FIND_EXIT_BOTTOM: Int = js.native
    val FIND_EXIT_LEFT: Int = js.native
    val FIND_EXIT: Int = js.native
    val FIND_CREEPS: Int = js.native
    val FIND_MY_CREEPS: Int = js.native
    val FIND_HOSTILE_CREEPS: Int = js.native
    val FIND_SOURCES_ACTIVE: Int = js.native
    val FIND_SOURCES: Int = js.native
    val FIND_DROPPED_RESOURCES: Int = js.native
    val FIND_STRUCTURES: Int = js.native
    val FIND_MY_STRUCTURES: Int = js.native
    val FIND_HOSTILE_STRUCTURES: Int = js.native
    val FIND_FLAGS: Int = js.native
    val FIND_CONSTRUCTION_SITES: Int = js.native
    val FIND_MY_SPAWNS: Int = js.native
    val FIND_HOSTILE_SPfAWNS: Int = js.native
    val FIND_MY_CONSTRUCTION_SITES: Int = js.native
    val FIND_HOSTILE_CONSTRUCTION_SITES: Int = js.native
    val FIND_MINERALS: Int = js.native
    val FIND_NUKES: Int = js.native
    val FIND_TOMBSTONES: Int = js.native
    val FIND_POWER_CREEPS: Int = js.native
    val FIND_MY_POWER_CREEPS: Int = js.native
    val FIND_HOSTILE_POWER_CREEPS: Int = js.native
    val FIND_DEPOSITS: Int = js.native
    val FIND_RUINS: Int = js.native
    val TOP: Int = js.native
    val TOP_RIGHT: Int = js.native
    val RIGHT: Int = js.native
    val BOTTOM_RIGHT: Int = js.native
    val BOTTOM: Int = js.native
    val BOTTOM_LEFT: Int = js.native
    val LEFT: Int = js.native
    val TOP_LEFT: Int = js.native
    val COLOR_RED: Int = js.native
    val COLOR_PURPLE: Int = js.native
    val COLOR_BLUE: Int = js.native
    val COLOR_CYAN: Int = js.native
    val COLOR_GREEN: Int = js.native
    val COLOR_YELLOW: Int = js.native
    val COLOR_ORANGE: Int = js.native
    val COLOR_BROWN: Int = js.native
    val COLOR_GREY: Int = js.native
    val COLOR_WHITE: Int = js.native
    val LOOK_CREEPS: String = js.native
    val LOOK_ENERGY: String = js.native
    val LOOK_RESOURCES: String = js.native
    val LOOK_SOURCES: String = js.native
    val LOOK_MINERALS: String = js.native
    val LOOK_DEPOSITS: String = js.native
    val LOOK_STRUCTURES: String = js.native
    val LOOK_FLAGS: String = js.native
    val LOOK_CONSTRUCTION_SITES: String = js.native
    val LOOK_NUKES: String = js.native
    val LOOK_TERRAIN: String = js.native
    val LOOK_TOMBSTONES: String = js.native
    val LOOK_POWER_CREEPS: String = js.native
    val LOOK_RUINS: String = js.native
    val OBSTACLE_OBJECT_TYPES: js.Object = js.native
    val MOVE: String = js.native
    val WORK: String = js.native
    val CARRY: String = js.native
    val ATTACK: String = js.native
    val RANGED_ATTACK: String = js.native
    val TOUGH: String = js.native
    val HEAL: String = js.native
    val CLAIM: String = js.native
    val BODYPART_COST: js.Object = js.native
    val WORLD_WIDTH: Int = js.native
    val WORLD_HEIGHT: Int = js.native
    val CREEP_LIFE_TIME: Int = js.native
    val CREEP_CLAIM_LIFE_TIME: Int = js.native
    val CREEP_CORPSE_RATE: Int = js.native
    val CREEP_PART_MAX_ENERGY: Int = js.native
    val CARRY_CAPACITY: Int = js.native
    val HARVEST_POWER: Int = js.native
    val HARVEST_MINERAL_POWER: Int = js.native
    val HARVEST_DEPOSIT_POWER: Int = js.native
    val REPAIR_POWER: Int = js.native
    val DISMANTLE_POWER: Int = js.native
    val BUILD_POWER: Int = js.native
    val ATTACK_POWER: Int = js.native
    val UPGRADE_CONTROLLER_POWER: Int = js.native
    val RANGED_ATTACK_POWER: Int = js.native
    val HEAL_POWER: Int = js.native
    val RANGED_HEAL_POWER: Int = js.native
    val REPAIR_COST: Int = js.native
    val DISMANTLE_COST: Int = js.native
    val RAMPART_DECAY_AMOUNT: Int = js.native
    val RAMPART_DECAY_TIME: Int = js.native
    val RAMPART_HITS: Int = js.native
    val RAMPART_HITS_MAX: js.Object = js.native
    val ENERGY_REGEN_TIME: Int = js.native
    val ENERGY_DECAY: Int = js.native
    val SPAWN_HITS: Int = js.native
    val SPAWN_ENERGY_START: Int = js.native
    val SPAWN_ENERGY_CAPACITY: Int = js.native
    val CREEP_SPAWN_TIME: Int = js.native
    val SPAWN_RENEW_RATIO: Int = js.native
    val SOURCE_ENERGY_CAPACITY: Int = js.native
    val SOURCE_ENERGY_NEUTRAL_CAPACITY: Int = js.native
    val SOURCE_ENERGY_KEEPER_CAPACITY: Int = js.native
    val WALL_HITS: Int = js.native
    val WALL_HITS_MAX: Int = js.native
    val EXTENSION_HITS: Int = js.native
    val EXTENSION_ENERGY_CAPACITY: js.Object = js.native
    val ROAD_HITS: Int = js.native
    val ROAD_WEAROUT: Int = js.native
    val ROAD_WEAROUT_POWER_CREEP: Int = js.native
    val ROAD_DECAY_AMOUNT: Int = js.native
    val ROAD_DECAY_TIME: Int = js.native
    val LINK_HITS: Int = js.native
    val LINK_HITS_MAX: Int = js.native
    val LINK_CAPACITY: Int = js.native
    val LINK_COOLDOWN: Int = js.native
    val LINK_LOSS_RATIO: Int = js.native
    val STORAGE_CAPACITY: Int = js.native
    val STORAGE_HITS: Int = js.native
    val STRUCTURE_SPAWN: String = js.native
    val STRUCTURE_EXTENSION: String = js.native
    val STRUCTURE_ROAD: String = js.native
    val STRUCTURE_WALL: String = js.native
    val STRUCTURE_RAMPART: String = js.native
    val STRUCTURE_KEEPER_LAIR: String = js.native
    val STRUCTURE_PORTAL: String = js.native
    val STRUCTURE_CONTROLLER: String = js.native
    val STRUCTURE_LINK: String = js.native
    val STRUCTURE_STORAGE: String = js.native
    val STRUCTURE_TOWER: String = js.native
    val STRUCTURE_OBSERVER: String = js.native
    val STRUCTURE_POWER_BANK: String = js.native
    val STRUCTURE_POWER_SPAWN: String = js.native
    val STRUCTURE_EXTRACTOR: String = js.native
    val STRUCTURE_LAB: String = js.native
    val STRUCTURE_TERMINAL: String = js.native
    val STRUCTURE_CONTAINER: String = js.native
    val STRUCTURE_NUKER: String = js.native
    val STRUCTURE_FACTORY: String = js.native
    val STRUCTURE_INVADER_CORE: String = js.native
    val CONSTRUCTION_COST: js.Object = js.native
    val CONSTRUCTION_COST_ROAD_SWAMP_RATIO: Int = js.native
    val CONSTRUCTION_COST_ROAD_WALL_RATIO: Int = js.native
    val CONTROLLER_LEVELS: js.Object = js.native
    val CONTROLLER_STRUCTURES: js.Object = js.native
    val CONTROLLER_DOWNGRADE: js.Object = js.native
    val CONTROLLER_DOWNGRADE_RESTORE: Int = js.native
    val CONTROLLER_DOWNGRADE_SAFEMODE_THRESHOLD: Int = js.native
    val CONTROLLER_CLAIM_DOWNGRADE: Int = js.native
    val CONTROLLER_RESERVE: Int = js.native
    val CONTROLLER_RESERVE_MAX: Int = js.native
    val CONTROLLER_MAX_UPGRADE_PER_TICK: Int = js.native
    val CONTROLLER_ATTACK_BLOCKED_UPGRADE: Int = js.native
    val CONTROLLER_NUKE_BLOCKED_UPGRADE: Int = js.native
    val SAFE_MODE_DURATION: Int = js.native
    val SAFE_MODE_COOLDOWN: Int = js.native
    val SAFE_MODE_COST: Int = js.native
    val TOWER_HITS: Int = js.native
    val TOWER_CAPACITY: Int = js.native
    val TOWER_ENERGY_COST: Int = js.native
    val TOWER_POWER_ATTACK: Int = js.native
    val TOWER_POWER_HEAL: Int = js.native
    val TOWER_POWER_REPAIR: Int = js.native
    val TOWER_OPTIMAL_RANGE: Int = js.native
    val TOWER_FALLOFF_RANGE: Int = js.native
    val TOWER_FALLOFF: Int = js.native
    val OBSERVER_HITS: Int = js.native
    val OBSERVER_RANGE: Int = js.native
    val POWER_BANK_HITS: Int = js.native
    val POWER_BANK_CAPACITY_MAX: Int = js.native
    val POWER_BANK_CAPACITY_MIN: Int = js.native
    val POWER_BANK_CAPACITY_CRIT: Int = js.native
    val POWER_BANK_DECAY: Int = js.native
    val POWER_BANK_HIT_BACK: Int = js.native
    val POWER_SPAWN_HITS: Int = js.native
    val POWER_SPAWN_ENERGY_CAPACITY: Int = js.native
    val POWER_SPAWN_POWER_CAPACITY: Int = js.native
    val POWER_SPAWN_ENERGY_RATIO: Int = js.native
    val EXTRACTOR_HITS: Int = js.native
    val EXTRACTOR_COOLDOWN: Int = js.native
    val LAB_HITS: Int = js.native
    val LAB_MINERAL_CAPACITY: Int = js.native
    val LAB_ENERGY_CAPACITY: Int = js.native
    val LAB_BOOST_ENERGY: Int = js.native
    val LAB_BOOST_MINERAL: Int = js.native
    val LAB_COOLDOWN: Int = js.native
    val LAB_REACTION_AMOUNT: Int = js.native
    val LAB_UNBOOST_ENERGY: Int = js.native
    val LAB_UNBOOST_MINERAL: Int = js.native
    val GCL_POW: Int = js.native
    val GCL_MULTIPLY: Int = js.native
    val GCL_NOVICE: Int = js.native
    val MODE_SIMULATION: js.Object = js.native
    val MODE_WORLD: js.Object = js.native
    val TERRAIN_MASK_WALL: Int = js.native
    val TERRAIN_MASK_SWAMP: Int = js.native
    val TERRAIN_MASK_LAVA: Int = js.native
    val MAX_CONSTRUCTION_SITES: Int = js.native
    val MAX_CREEP_SIZE: Int = js.native
    val MINERAL_REGEN_TIME: Int = js.native
    val MINERAL_MIN_AMOUNT: js.Object = js.native
    val MINERAL_RANDOM_FACTOR: Int = js.native
    val MINERAL_DENSITY: js.Object = js.native
    val MINERAL_DENSITY_PROBABILITY: js.Object = js.native
    val MINERAL_DENSITY_CHANGE: Int = js.native
    val DENSITY_LOW: Int = js.native
    val DENSITY_MODERATE: Int = js.native
    val DENSITY_HIGH: Int = js.native
    val DENSITY_ULTRA: Int = js.native
    val DEPOSIT_EXHAUST_MULTIPLY: Int = js.native
    val DEPOSIT_EXHAUST_POW: Int = js.native
    val DEPOSIT_DECAY_TIME: Int = js.native
    val TERMINAL_CAPACITY: Int = js.native
    val TERMINAL_HITS: Int = js.native
    val TERMINAL_SEND_COST: Int = js.native
    val TERMINAL_MIN_SEND: Int = js.native
    val TERMINAL_COOLDOWN: Int = js.native
    val CONTAINER_HITS: Int = js.native
    val CONTAINER_CAPACITY: Int = js.native
    val CONTAINER_DECAY: Int = js.native
    val CONTAINER_DECAY_TIME: Int = js.native
    val CONTAINER_DECAY_TIME_OWNED: Int = js.native
    val NUKER_HITS: Int = js.native
    val NUKER_COOLDOWN: Int = js.native
    val NUKER_ENERGY_CAPACITY: Int = js.native
    val NUKER_GHODIUM_CAPACITY: Int = js.native
    val NUKE_LAND_TIME: Int = js.native
    val NUKE_RANGE: Int = js.native
    val NUKE_DAMAGE: js.Object = js.native
    val FACTORY_HITS: Int = js.native
    val FACTORY_CAPACITY: Int = js.native
    val TOMBSTONE_DECAY_PER_PART: Int = js.native
    val TOMBSTONE_DECAY_POWER_CREEP: Int = js.native
    val RUIN_DECAY: Int = js.native
    val RUIN_DECAY_STRUCTURES: js.Object = js.native
    val PORTAL_DECAY: Int = js.native
    val ORDER_SELL: String = js.native
    val ORDER_BUY: String = js.native
    val MARKET_FEE: Int = js.native
    val MARKET_MAX_ORDERS: Int = js.native
    val MARKET_ORDER_LIFE_TIME: Int = js.native
    val FLAGS_LIMIT: Int = js.native
    val SUBSCRIPTION_TOKEN: String = js.native
    val CPU_UNLOCK: String = js.native
    val PIXEL: String = js.native
    val ACCESS_KEY: String = js.native
    val PIXEL_CPU_COST: Int = js.native
    val RESOURCE_ENERGY: String = js.native
    val RESOURCE_POWER: String = js.native
    val RESOURCE_HYDROGEN: String = js.native
    val RESOURCE_OXYGEN: String = js.native
    val RESOURCE_UTRIUM: String = js.native
    val RESOURCE_LEMERGIUM: String = js.native
    val RESOURCE_KEANIUM: String = js.native
    val RESOURCE_ZYNTHIUM: String = js.native
    val RESOURCE_CATALYST: String = js.native
    val RESOURCE_GHODIUM: String = js.native
    val RESOURCE_SILICON: String = js.native
    val RESOURCE_METAL: String = js.native
    val RESOURCE_BIOMASS: String = js.native
    val RESOURCE_MIST: String = js.native
    val RESOURCE_HYDROXIDE: String = js.native
    val RESOURCE_ZYNTHIUM_KEANITE: String = js.native
    val RESOURCE_UTRIUM_LEMERGITE: String = js.native
    val RESOURCE_UTRIUM_HYDRIDE: String = js.native
    val RESOURCE_UTRIUM_OXIDE: String = js.native
    val RESOURCE_KEANIUM_HYDRIDE: String = js.native
    val RESOURCE_KEANIUM_OXIDE: String = js.native
    val RESOURCE_LEMERGIUM_HYDRIDE: String = js.native
    val RESOURCE_LEMERGIUM_OXIDE: String = js.native
    val RESOURCE_ZYNTHIUM_HYDRIDE: String = js.native
    val RESOURCE_ZYNTHIUM_OXIDE: String = js.native
    val RESOURCE_GHODIUM_HYDRIDE: String = js.native
    val RESOURCE_GHODIUM_OXIDE: String = js.native
    val RESOURCE_UTRIUM_ACID: String = js.native
    val RESOURCE_UTRIUM_ALKALIDE: String = js.native
    val RESOURCE_KEANIUM_ACID: String = js.native
    val RESOURCE_KEANIUM_ALKALIDE: String = js.native
    val RESOURCE_LEMERGIUM_ACID: String = js.native
    val RESOURCE_LEMERGIUM_ALKALIDE: String = js.native
    val RESOURCE_ZYNTHIUM_ACID: String = js.native
    val RESOURCE_ZYNTHIUM_ALKALIDE: String = js.native
    val RESOURCE_GHODIUM_ACID: String = js.native
    val RESOURCE_GHODIUM_ALKALIDE: String = js.native
    val RESOURCE_CATALYZED_UTRIUM_ACID: String = js.native
    val RESOURCE_CATALYZED_UTRIUM_ALKALIDE: String = js.native
    val RESOURCE_CATALYZED_KEANIUM_ACID: String = js.native
    val RESOURCE_CATALYZED_KEANIUM_ALKALIDE: String = js.native
    val RESOURCE_CATALYZED_LEMERGIUM_ACID: String = js.native
    val RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE: String = js.native
    val RESOURCE_CATALYZED_ZYNTHIUM_ACID: String = js.native
    val RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE: String = js.native
    val RESOURCE_CATALYZED_GHODIUM_ACID: String = js.native
    val RESOURCE_CATALYZED_GHODIUM_ALKALIDE: String = js.native
    val RESOURCE_OPS: String = js.native
    val RESOURCE_UTRIUM_BAR: String = js.native
    val RESOURCE_LEMERGIUM_BAR: String = js.native
    val RESOURCE_ZYNTHIUM_BAR: String = js.native
    val RESOURCE_KEANIUM_BAR: String = js.native
    val RESOURCE_GHODIUM_MELT: String = js.native
    val RESOURCE_OXIDANT: String = js.native
    val RESOURCE_REDUCTANT: String = js.native
    val RESOURCE_PURIFIER: String = js.native
    val RESOURCE_BATTERY: String = js.native
    val RESOURCE_COMPOSITE: String = js.native
    val RESOURCE_CRYSTAL: String = js.native
    val RESOURCE_LIQUID: String = js.native
    val RESOURCE_WIRE: String = js.native
    val RESOURCE_SWITCH: String = js.native
    val RESOURCE_TRANSISTOR: String = js.native
    val RESOURCE_MICROCHIP: String = js.native
    val RESOURCE_CIRCUIT: String = js.native
    val RESOURCE_DEVICE: String = js.native
    val RESOURCE_CELL: String = js.native
    val RESOURCE_PHLEGM: String = js.native
    val RESOURCE_TISSUE: String = js.native
    val RESOURCE_MUSCLE: String = js.native
    val RESOURCE_ORGANOID: String = js.native
    val RESOURCE_ORGANISM: String = js.native
    val RESOURCE_ALLOY: String = js.native
    val RESOURCE_TUBE: String = js.native
    val RESOURCE_FIXTURES: String = js.native
    val RESOURCE_FRAME: String = js.native
    val RESOURCE_HYDRAULICS: String = js.native
    val RESOURCE_MACHINE: String = js.native
    val RESOURCE_CONDENSATE: String = js.native
    val RESOURCE_CONCENTRATE: String = js.native
    val RESOURCE_EXTRACT: String = js.native
    val RESOURCE_SPIRIT: String = js.native
    val RESOURCE_EMANATION: String = js.native
    val RESOURCE_ESSENCE: String = js.native
    val REACTIONS: js.Object = js.native
    val BOOSTS: js.Object = js.native
    val REACTION_TIME: js.Object = js.native
    val PORTAL_UNSTABLE: Int = js.native
    val PORTAL_MIN_TIMEOUT: Int = js.native
    val PORTAL_MAX_TIMEOUT: Int = js.native
    val POWER_BANK_RESPAWN_TIME: Int = js.native
    val INVADERS_ENERGY_GOAL: Int = js.native
    val SYSTEM_USERNAME: String = js.native
    val SIGN_NOVICE_AREA: String = js.native
    val SIGN_RESPAWN_AREA: String = js.native
    val SIGN_PLANNED_AREA: String = js.native
    val EVENT_ATTACK: Int = js.native
    val EVENT_OBJECT_DESTROYED: Int = js.native
    val EVENT_ATTACK_CONTROLLER: Int = js.native
    val EVENT_BUILD: Int = js.native
    val EVENT_HARVEST: Int = js.native
    val EVENT_HEAL: Int = js.native
    val EVENT_REPAIR: Int = js.native
    val EVENT_RESERVE_CONTROLLER: Int = js.native
    val EVENT_UPGRADE_CONTROLLER: Int = js.native
    val EVENT_EXIT: Int = js.native
    val EVENT_POWER: Int = js.native
    val EVENT_TRANSFER: Int = js.native
    val EVENT_ATTACK_TYPE_MELEE: Int = js.native
    val EVENT_ATTACK_TYPE_RANGED: Int = js.native
    val EVENT_ATTACK_TYPE_RANGED_MASS: Int = js.native
    val EVENT_ATTACK_TYPE_DISMANTLE: Int = js.native
    val EVENT_ATTACK_TYPE_HIT_BACK: Int = js.native
    val EVENT_ATTACK_TYPE_NUKE: Int = js.native
    val EVENT_HEAL_TYPE_MELEE: Int = js.native
    val EVENT_HEAL_TYPE_RANGED: Int = js.native
    val POWER_LEVEL_MULTIPLY: Int = js.native
    val POWER_LEVEL_POW: Int = js.native
    val POWER_CREEP_SPAWN_COOLDOWN: Int = js.native
    val POWER_CREEP_DELETE_COOLDOWN: Int = js.native
    val POWER_CREEP_MAX_LEVEL: Int = js.native
    val POWER_CREEP_LIFE_TIME: Int = js.native
    val POWER_CLASS: js.Object = js.native
    val PWR_GENERATE_OPS: Int = js.native
    val PWR_OPERATE_SPAWN: Int = js.native
    val PWR_OPERATE_TOWER: Int = js.native
    val PWR_OPERATE_STORAGE: Int = js.native
    val PWR_OPERATE_LAB: Int = js.native
    val PWR_OPERATE_EXTENSION: Int = js.native
    val PWR_OPERATE_OBSERVER: Int = js.native
    val PWR_OPERATE_TERMINAL: Int = js.native
    val PWR_DISRUPT_SPAWN: Int = js.native
    val PWR_DISRUPT_TOWER: Int = js.native
    val PWR_DISRUPT_SOURCE: Int = js.native
    val PWR_SHIELD: Int = js.native
    val PWR_REGEN_SOURCE: Int = js.native
    val PWR_REGEN_MINERAL: Int = js.native
    val PWR_DISRUPT_TERMINAL: Int = js.native
    val PWR_OPERATE_POWER: Int = js.native
    val PWR_FORTIFY: Int = js.native
    val PWR_OPERATE_CONTROLLER: Int = js.native
    val PWR_OPERATE_FACTORY: Int = js.native
    val EFFECT_INVULNERABILITY: Int = js.native
    val EFFECT_COLLAPSE_TIMER: Int = js.native
    val INVADER_CORE_HITS: Int = js.native
    val INVADER_CORE_CREEP_SPAWN_TIME: js.Object = js.native
    val INVADER_CORE_EXPAND_TIME: js.Object = js.native
    val INVADER_CORE_CONTROLLER_POWER: Int = js.native
    val INVADER_CORE_CONTROLLER_DOWNGRADE: Int = js.native
    val STRONGHOLD_RAMPART_HITS: js.Object = js.native
    val STRONGHOLD_DECAY_TICKS: Int = js.native
  }
}
