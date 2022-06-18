package facade

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Game {

  @js.native
  trait RoomPosition extends js.Object {
    val x: js.BigInt = js.native
    val y: js.BigInt = js.native
  }

  @js.native
  trait GameObject extends RoomPosition {
    val exists: Boolean = js.native
    val id: String = js.native
    val ticksToDecay: js.BigInt = js.native

  }

  @js.native
  trait Structure extends GameObject {
    val hits: js.BigInt = js.native
    val hitsMax: js.BigInt = js.native
  }


  trait BodyPartDescriptor extends js.Object {
    val `type`: String
    val hits: js.BigInt
  }

  @js.native
  trait Creep extends GameObject {
    val body: js.Array[BodyPartDescriptor] = js.native
    val fatigue: js.BigInt = js.native
    val my: Boolean = js.native
    val hits: js.BigInt = js.native
    val hitsMax: js.BigInt = js.native
    def attack(target: Creep | Structure): js.BigInt = js.native
    def heal(target: Creep): js.BigInt = js.native
    def rangedAttack(target: Creep | Structure): js.BigInt = js.native

    def moveTo(target: RoomPosition, opts: Option[js.Object] = None): js.BigInt = js.native
  }

  @js.native
  trait Flag extends GameObject {
    val my: Boolean = js.native
  }

  @js.native
  @JSImport("/game/utils", JSImport.Namespace)
  object utils extends js.Object {
    def getTicks(): js.BigInt = js.native
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
    val OK: js.BigInt = js.native
    val ERR_NOT_OWNER: js.BigInt = js.native
    val ERR_NO_PATH: js.BigInt = js.native
    val ERR_NAME_EXISTS: js.BigInt = js.native
    val ERR_BUSY: js.BigInt = js.native
    val ERR_NOT_FOUND: js.BigInt = js.native
    val ERR_NOT_ENOUGH_ENERGY: js.BigInt = js.native
    val ERR_NOT_ENOUGH_RESOURCES: js.BigInt = js.native
    val ERR_INVALID_TARGET: js.BigInt = js.native
    val ERR_FULL: js.BigInt = js.native
    val ERR_NOT_IN_RANGE: js.BigInt = js.native
    val ERR_INVALID_ARGS: js.BigInt = js.native
    val ERR_TIRED: js.BigInt = js.native
    val ERR_NO_BODYPART: js.BigInt = js.native
    val ERR_NOT_ENOUGH_EXTENSIONS: js.BigInt = js.native
    val ERR_RCL_NOT_ENOUGH: js.BigInt = js.native
    val ERR_GCL_NOT_ENOUGH: js.BigInt = js.native
    val FIND_EXIT_TOP: js.BigInt = js.native
    val FIND_EXIT_RIGHT: js.BigInt = js.native
    val FIND_EXIT_BOTTOM: js.BigInt = js.native
    val FIND_EXIT_LEFT: js.BigInt = js.native
    val FIND_EXIT: js.BigInt = js.native
    val FIND_CREEPS: js.BigInt = js.native
    val FIND_MY_CREEPS: js.BigInt = js.native
    val FIND_HOSTILE_CREEPS: js.BigInt = js.native
    val FIND_SOURCES_ACTIVE: js.BigInt = js.native
    val FIND_SOURCES: js.BigInt = js.native
    val FIND_DROPPED_RESOURCES: js.BigInt = js.native
    val FIND_STRUCTURES: js.BigInt = js.native
    val FIND_MY_STRUCTURES: js.BigInt = js.native
    val FIND_HOSTILE_STRUCTURES: js.BigInt = js.native
    val FIND_FLAGS: js.BigInt = js.native
    val FIND_CONSTRUCTION_SITES: js.BigInt = js.native
    val FIND_MY_SPAWNS: js.BigInt = js.native
    val FIND_HOSTILE_SPfAWNS: js.BigInt = js.native
    val FIND_MY_CONSTRUCTION_SITES: js.BigInt = js.native
    val FIND_HOSTILE_CONSTRUCTION_SITES: js.BigInt = js.native
    val FIND_MINERALS: js.BigInt = js.native
    val FIND_NUKES: js.BigInt = js.native
    val FIND_TOMBSTONES: js.BigInt = js.native
    val FIND_POWER_CREEPS: js.BigInt = js.native
    val FIND_MY_POWER_CREEPS: js.BigInt = js.native
    val FIND_HOSTILE_POWER_CREEPS: js.BigInt = js.native
    val FIND_DEPOSITS: js.BigInt = js.native
    val FIND_RUINS: js.BigInt = js.native
    val TOP: js.BigInt = js.native
    val TOP_RIGHT: js.BigInt = js.native
    val RIGHT: js.BigInt = js.native
    val BOTTOM_RIGHT: js.BigInt = js.native
    val BOTTOM: js.BigInt = js.native
    val BOTTOM_LEFT: js.BigInt = js.native
    val LEFT: js.BigInt = js.native
    val TOP_LEFT: js.BigInt = js.native
    val COLOR_RED: js.BigInt = js.native
    val COLOR_PURPLE: js.BigInt = js.native
    val COLOR_BLUE: js.BigInt = js.native
    val COLOR_CYAN: js.BigInt = js.native
    val COLOR_GREEN: js.BigInt = js.native
    val COLOR_YELLOW: js.BigInt = js.native
    val COLOR_ORANGE: js.BigInt = js.native
    val COLOR_BROWN: js.BigInt = js.native
    val COLOR_GREY: js.BigInt = js.native
    val COLOR_WHITE: js.BigInt = js.native
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
    val WORLD_WIDTH: js.BigInt = js.native
    val WORLD_HEIGHT: js.BigInt = js.native
    val CREEP_LIFE_TIME: js.BigInt = js.native
    val CREEP_CLAIM_LIFE_TIME: js.BigInt = js.native
    val CREEP_CORPSE_RATE: js.BigInt = js.native
    val CREEP_PART_MAX_ENERGY: js.BigInt = js.native
    val CARRY_CAPACITY: js.BigInt = js.native
    val HARVEST_POWER: js.BigInt = js.native
    val HARVEST_MINERAL_POWER: js.BigInt = js.native
    val HARVEST_DEPOSIT_POWER: js.BigInt = js.native
    val REPAIR_POWER: js.BigInt = js.native
    val DISMANTLE_POWER: js.BigInt = js.native
    val BUILD_POWER: js.BigInt = js.native
    val ATTACK_POWER: js.BigInt = js.native
    val UPGRADE_CONTROLLER_POWER: js.BigInt = js.native
    val RANGED_ATTACK_POWER: js.BigInt = js.native
    val HEAL_POWER: js.BigInt = js.native
    val RANGED_HEAL_POWER: js.BigInt = js.native
    val REPAIR_COST: js.BigInt = js.native
    val DISMANTLE_COST: js.BigInt = js.native
    val RAMPART_DECAY_AMOUNT: js.BigInt = js.native
    val RAMPART_DECAY_TIME: js.BigInt = js.native
    val RAMPART_HITS: js.BigInt = js.native
    val RAMPART_HITS_MAX: js.Object = js.native
    val ENERGY_REGEN_TIME: js.BigInt = js.native
    val ENERGY_DECAY: js.BigInt = js.native
    val SPAWN_HITS: js.BigInt = js.native
    val SPAWN_ENERGY_START: js.BigInt = js.native
    val SPAWN_ENERGY_CAPACITY: js.BigInt = js.native
    val CREEP_SPAWN_TIME: js.BigInt = js.native
    val SPAWN_RENEW_RATIO: js.BigInt = js.native
    val SOURCE_ENERGY_CAPACITY: js.BigInt = js.native
    val SOURCE_ENERGY_NEUTRAL_CAPACITY: js.BigInt = js.native
    val SOURCE_ENERGY_KEEPER_CAPACITY: js.BigInt = js.native
    val WALL_HITS: js.BigInt = js.native
    val WALL_HITS_MAX: js.BigInt = js.native
    val EXTENSION_HITS: js.BigInt = js.native
    val EXTENSION_ENERGY_CAPACITY: js.Object = js.native
    val ROAD_HITS: js.BigInt = js.native
    val ROAD_WEAROUT: js.BigInt = js.native
    val ROAD_WEAROUT_POWER_CREEP: js.BigInt = js.native
    val ROAD_DECAY_AMOUNT: js.BigInt = js.native
    val ROAD_DECAY_TIME: js.BigInt = js.native
    val LINK_HITS: js.BigInt = js.native
    val LINK_HITS_MAX: js.BigInt = js.native
    val LINK_CAPACITY: js.BigInt = js.native
    val LINK_COOLDOWN: js.BigInt = js.native
    val LINK_LOSS_RATIO: js.BigInt = js.native
    val STORAGE_CAPACITY: js.BigInt = js.native
    val STORAGE_HITS: js.BigInt = js.native
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
    val CONSTRUCTION_COST_ROAD_SWAMP_RATIO: js.BigInt = js.native
    val CONSTRUCTION_COST_ROAD_WALL_RATIO: js.BigInt = js.native
    val CONTROLLER_LEVELS: js.Object = js.native
    val CONTROLLER_STRUCTURES: js.Object = js.native
    val CONTROLLER_DOWNGRADE: js.Object = js.native
    val CONTROLLER_DOWNGRADE_RESTORE: js.BigInt = js.native
    val CONTROLLER_DOWNGRADE_SAFEMODE_THRESHOLD: js.BigInt = js.native
    val CONTROLLER_CLAIM_DOWNGRADE: js.BigInt = js.native
    val CONTROLLER_RESERVE: js.BigInt = js.native
    val CONTROLLER_RESERVE_MAX: js.BigInt = js.native
    val CONTROLLER_MAX_UPGRADE_PER_TICK: js.BigInt = js.native
    val CONTROLLER_ATTACK_BLOCKED_UPGRADE: js.BigInt = js.native
    val CONTROLLER_NUKE_BLOCKED_UPGRADE: js.BigInt = js.native
    val SAFE_MODE_DURATION: js.BigInt = js.native
    val SAFE_MODE_COOLDOWN: js.BigInt = js.native
    val SAFE_MODE_COST: js.BigInt = js.native
    val TOWER_HITS: js.BigInt = js.native
    val TOWER_CAPACITY: js.BigInt = js.native
    val TOWER_ENERGY_COST: js.BigInt = js.native
    val TOWER_POWER_ATTACK: js.BigInt = js.native
    val TOWER_POWER_HEAL: js.BigInt = js.native
    val TOWER_POWER_REPAIR: js.BigInt = js.native
    val TOWER_OPTIMAL_RANGE: js.BigInt = js.native
    val TOWER_FALLOFF_RANGE: js.BigInt = js.native
    val TOWER_FALLOFF: js.BigInt = js.native
    val OBSERVER_HITS: js.BigInt = js.native
    val OBSERVER_RANGE: js.BigInt = js.native
    val POWER_BANK_HITS: js.BigInt = js.native
    val POWER_BANK_CAPACITY_MAX: js.BigInt = js.native
    val POWER_BANK_CAPACITY_MIN: js.BigInt = js.native
    val POWER_BANK_CAPACITY_CRIT: js.BigInt = js.native
    val POWER_BANK_DECAY: js.BigInt = js.native
    val POWER_BANK_HIT_BACK: js.BigInt = js.native
    val POWER_SPAWN_HITS: js.BigInt = js.native
    val POWER_SPAWN_ENERGY_CAPACITY: js.BigInt = js.native
    val POWER_SPAWN_POWER_CAPACITY: js.BigInt = js.native
    val POWER_SPAWN_ENERGY_RATIO: js.BigInt = js.native
    val EXTRACTOR_HITS: js.BigInt = js.native
    val EXTRACTOR_COOLDOWN: js.BigInt = js.native
    val LAB_HITS: js.BigInt = js.native
    val LAB_MINERAL_CAPACITY: js.BigInt = js.native
    val LAB_ENERGY_CAPACITY: js.BigInt = js.native
    val LAB_BOOST_ENERGY: js.BigInt = js.native
    val LAB_BOOST_MINERAL: js.BigInt = js.native
    val LAB_COOLDOWN: js.BigInt = js.native
    val LAB_REACTION_AMOUNT: js.BigInt = js.native
    val LAB_UNBOOST_ENERGY: js.BigInt = js.native
    val LAB_UNBOOST_MINERAL: js.BigInt = js.native
    val GCL_POW: js.BigInt = js.native
    val GCL_MULTIPLY: js.BigInt = js.native
    val GCL_NOVICE: js.BigInt = js.native
    val MODE_SIMULATION: js.Object = js.native
    val MODE_WORLD: js.Object = js.native
    val TERRAIN_MASK_WALL: js.BigInt = js.native
    val TERRAIN_MASK_SWAMP: js.BigInt = js.native
    val TERRAIN_MASK_LAVA: js.BigInt = js.native
    val MAX_CONSTRUCTION_SITES: js.BigInt = js.native
    val MAX_CREEP_SIZE: js.BigInt = js.native
    val MINERAL_REGEN_TIME: js.BigInt = js.native
    val MINERAL_MIN_AMOUNT: js.Object = js.native
    val MINERAL_RANDOM_FACTOR: js.BigInt = js.native
    val MINERAL_DENSITY: js.Object = js.native
    val MINERAL_DENSITY_PROBABILITY: js.Object = js.native
    val MINERAL_DENSITY_CHANGE: js.BigInt = js.native
    val DENSITY_LOW: js.BigInt = js.native
    val DENSITY_MODERATE: js.BigInt = js.native
    val DENSITY_HIGH: js.BigInt = js.native
    val DENSITY_ULTRA: js.BigInt = js.native
    val DEPOSIT_EXHAUST_MULTIPLY: js.BigInt = js.native
    val DEPOSIT_EXHAUST_POW: js.BigInt = js.native
    val DEPOSIT_DECAY_TIME: js.BigInt = js.native
    val TERMINAL_CAPACITY: js.BigInt = js.native
    val TERMINAL_HITS: js.BigInt = js.native
    val TERMINAL_SEND_COST: js.BigInt = js.native
    val TERMINAL_MIN_SEND: js.BigInt = js.native
    val TERMINAL_COOLDOWN: js.BigInt = js.native
    val CONTAINER_HITS: js.BigInt = js.native
    val CONTAINER_CAPACITY: js.BigInt = js.native
    val CONTAINER_DECAY: js.BigInt = js.native
    val CONTAINER_DECAY_TIME: js.BigInt = js.native
    val CONTAINER_DECAY_TIME_OWNED: js.BigInt = js.native
    val NUKER_HITS: js.BigInt = js.native
    val NUKER_COOLDOWN: js.BigInt = js.native
    val NUKER_ENERGY_CAPACITY: js.BigInt = js.native
    val NUKER_GHODIUM_CAPACITY: js.BigInt = js.native
    val NUKE_LAND_TIME: js.BigInt = js.native
    val NUKE_RANGE: js.BigInt = js.native
    val NUKE_DAMAGE: js.Object = js.native
    val FACTORY_HITS: js.BigInt = js.native
    val FACTORY_CAPACITY: js.BigInt = js.native
    val TOMBSTONE_DECAY_PER_PART: js.BigInt = js.native
    val TOMBSTONE_DECAY_POWER_CREEP: js.BigInt = js.native
    val RUIN_DECAY: js.BigInt = js.native
    val RUIN_DECAY_STRUCTURES: js.Object = js.native
    val PORTAL_DECAY: js.BigInt = js.native
    val ORDER_SELL: String = js.native
    val ORDER_BUY: String = js.native
    val MARKET_FEE: js.BigInt = js.native
    val MARKET_MAX_ORDERS: js.BigInt = js.native
    val MARKET_ORDER_LIFE_TIME: js.BigInt = js.native
    val FLAGS_LIMIT: js.BigInt = js.native
    val SUBSCRIPTION_TOKEN: String = js.native
    val CPU_UNLOCK: String = js.native
    val PIXEL: String = js.native
    val ACCESS_KEY: String = js.native
    val PIXEL_CPU_COST: js.BigInt = js.native
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
    val PORTAL_UNSTABLE: js.BigInt = js.native
    val PORTAL_MIN_TIMEOUT: js.BigInt = js.native
    val PORTAL_MAX_TIMEOUT: js.BigInt = js.native
    val POWER_BANK_RESPAWN_TIME: js.BigInt = js.native
    val INVADERS_ENERGY_GOAL: js.BigInt = js.native
    val SYSTEM_USERNAME: String = js.native
    val SIGN_NOVICE_AREA: String = js.native
    val SIGN_RESPAWN_AREA: String = js.native
    val SIGN_PLANNED_AREA: String = js.native
    val EVENT_ATTACK: js.BigInt = js.native
    val EVENT_OBJECT_DESTROYED: js.BigInt = js.native
    val EVENT_ATTACK_CONTROLLER: js.BigInt = js.native
    val EVENT_BUILD: js.BigInt = js.native
    val EVENT_HARVEST: js.BigInt = js.native
    val EVENT_HEAL: js.BigInt = js.native
    val EVENT_REPAIR: js.BigInt = js.native
    val EVENT_RESERVE_CONTROLLER: js.BigInt = js.native
    val EVENT_UPGRADE_CONTROLLER: js.BigInt = js.native
    val EVENT_EXIT: js.BigInt = js.native
    val EVENT_POWER: js.BigInt = js.native
    val EVENT_TRANSFER: js.BigInt = js.native
    val EVENT_ATTACK_TYPE_MELEE: js.BigInt = js.native
    val EVENT_ATTACK_TYPE_RANGED: js.BigInt = js.native
    val EVENT_ATTACK_TYPE_RANGED_MASS: js.BigInt = js.native
    val EVENT_ATTACK_TYPE_DISMANTLE: js.BigInt = js.native
    val EVENT_ATTACK_TYPE_HIT_BACK: js.BigInt = js.native
    val EVENT_ATTACK_TYPE_NUKE: js.BigInt = js.native
    val EVENT_HEAL_TYPE_MELEE: js.BigInt = js.native
    val EVENT_HEAL_TYPE_RANGED: js.BigInt = js.native
    val POWER_LEVEL_MULTIPLY: js.BigInt = js.native
    val POWER_LEVEL_POW: js.BigInt = js.native
    val POWER_CREEP_SPAWN_COOLDOWN: js.BigInt = js.native
    val POWER_CREEP_DELETE_COOLDOWN: js.BigInt = js.native
    val POWER_CREEP_MAX_LEVEL: js.BigInt = js.native
    val POWER_CREEP_LIFE_TIME: js.BigInt = js.native
    val POWER_CLASS: js.Object = js.native
    val PWR_GENERATE_OPS: js.BigInt = js.native
    val PWR_OPERATE_SPAWN: js.BigInt = js.native
    val PWR_OPERATE_TOWER: js.BigInt = js.native
    val PWR_OPERATE_STORAGE: js.BigInt = js.native
    val PWR_OPERATE_LAB: js.BigInt = js.native
    val PWR_OPERATE_EXTENSION: js.BigInt = js.native
    val PWR_OPERATE_OBSERVER: js.BigInt = js.native
    val PWR_OPERATE_TERMINAL: js.BigInt = js.native
    val PWR_DISRUPT_SPAWN: js.BigInt = js.native
    val PWR_DISRUPT_TOWER: js.BigInt = js.native
    val PWR_DISRUPT_SOURCE: js.BigInt = js.native
    val PWR_SHIELD: js.BigInt = js.native
    val PWR_REGEN_SOURCE: js.BigInt = js.native
    val PWR_REGEN_MINERAL: js.BigInt = js.native
    val PWR_DISRUPT_TERMINAL: js.BigInt = js.native
    val PWR_OPERATE_POWER: js.BigInt = js.native
    val PWR_FORTIFY: js.BigInt = js.native
    val PWR_OPERATE_CONTROLLER: js.BigInt = js.native
    val PWR_OPERATE_FACTORY: js.BigInt = js.native
    val EFFECT_INVULNERABILITY: js.BigInt = js.native
    val EFFECT_COLLAPSE_TIMER: js.BigInt = js.native
    val INVADER_CORE_HITS: js.BigInt = js.native
    val INVADER_CORE_CREEP_SPAWN_TIME: js.Object = js.native
    val INVADER_CORE_EXPAND_TIME: js.Object = js.native
    val INVADER_CORE_CONTROLLER_POWER: js.BigInt = js.native
    val INVADER_CORE_CONTROLLER_DOWNGRADE: js.BigInt = js.native
    val STRONGHOLD_RAMPART_HITS: js.Object = js.native
    val STRONGHOLD_DECAY_TICKS: js.BigInt = js.native
  }
}
