package es.yeffry.valorantapi.data.datasource.agents.mock

import es.yeffry.valorantapi.data.datasource.agents.AgentsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.agents.remote.api.dto.AbilityDto
import es.yeffry.valorantapi.data.datasource.agents.dto.AgentDto
import es.yeffry.valorantapi.data.datasource.agents.dto.RoleDto

class AgentsMockDataSourceImpl() : AgentsDataSourceInterface {
    override suspend fun getAgents(): List<AgentDto> {
        return listOf(
            AgentDto(
                abilities = listOf(
                    AbilityDto(
                        slot = "Ability1",
                        displayName = "Wingman",
                        description = "EQUIP Wingman. FIRE to send Wingman forward seeking enemies. Wingman unleashes a concussive blast toward the first enemy he sees. ALT FIRE when targeting a Spike site or planted Spike to have Wingman defuse or plant the Spike. To plant, Gekko must have the Spike in his inventory. When Wingman expires he reverts into a dormant globule. INTERACT to reclaim the globule and gain another Wingman charge after a short cooldown.",
                        displayIcon = "https://media.valorant-api.com/agents/e370fa57-4757-3604-3648-499e1f642d3f/abilities/ability1/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Ability2",
                        displayName = "Dizzy",
                        description = "EQUIP Dizzy. FIRE to send Dizzy soaring forward through the air. Dizzy charges then unleashes plasma blasts at enemies in line of sight. Enemies hit by her plasma are Blinded. When Dizzy expires she reverts into a dormant globule. INTERACT to reclaim the globule and gain another Dizzy charge after a short cooldown.",
                        displayIcon = "https://media.valorant-api.com/agents/e370fa57-4757-3604-3648-499e1f642d3f/abilities/ability2/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Grenade",
                        displayName = "Mosh Pit",
                        description = "EQUIP Mosh. FIRE to throw Mosh like a grenade. ALT FIRE to lob. Upon landing Mosh duplicates across a large area that deals a small amount of damage over time then after a short delay explodes.",
                        displayIcon = "https://media.valorant-api.com/agents/e370fa57-4757-3604-3648-499e1f642d3f/abilities/grenade/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Ultimate",
                        displayName = "Thrash",
                        description = "EQUIP Thrash. FIRE to link with Thrash’s mind and steer her through enemy territory. ACTIVATE to lunge forward and explode, Detaining any players in a small radius. When Thrash expires she reverts into a dormant globule. INTERACT to reclaim the globule and gain another Thrash charge after a short cooldown. Thrash can be reclaimed once.",
                        displayIcon = "https://media.valorant-api.com/agents/e370fa57-4757-3604-3648-499e1f642d3f/abilities/ultimate/displayicon.png"
                    )
                ),
                uuid = "e370fa57-4757-3604-3648-499e1f642d3f",
                displayName = "Gekko",
                description = "Gekko the Angeleno leads a tight-knit crew of calamitous creatures. His buddies bound forward, scattering enemies out of the way, with Gekko chasing them down to regroup and go again.",
                developerName = "Aggrobot",
                displayIcon = "https://media.valorant-api.com/agents/e370fa57-4757-3604-3648-499e1f642d3f/displayicon.png",
                displayIconSmall = "https://media.valorant-api.com/agents/e370fa57-4757-3604-3648-499e1f642d3f/displayiconsmall.png",
                bustPortrait = "https://media.valorant-api.com/agents/e370fa57-4757-3604-3648-499e1f642d3f/fullportrait.png",
                fullPortrait = "https://media.valorant-api.com/agents/e370fa57-4757-3604-3648-499e1f642d3f/fullportrait.png",
                fullPortraitV2 = "https://media.valorant-api.com/agents/e370fa57-4757-3604-3648-499e1f642d3f/fullportrait.png",
                killfeedPortrait = "https://media.valorant-api.com/agents/e370fa57-4757-3604-3648-499e1f642d3f/killfeedportrait.png",
                background = "https://media.valorant-api.com/agents/e370fa57-4757-3604-3648-499e1f642d3f/background.png",
                backgroundGradientColors = listOf(
                    "c7f458ff",
                    "d56324ff",
                    "3a2656ff",
                    "3a7233ff"
                ),
                assetPath = "ShooterGame/Content/Characters/AggroBot/AggroBot_PrimaryAsset",
                isFullPortraitRightFacing = false,
                isPlayableCharacter = true,
                isAvailableForTest = false,
                isBaseContent = false,
                role = RoleDto(
                    uuid = "1b47567f-8f7b-444b-aae3-b0c634622d10",
                    displayName = "Initiator",
                    description = "Initiators challenge angles by setting up their team to enter contested ground and push defenders away.",
                    displayIcon = "https://media.valorant-api.com/agents/roles/1b47567f-8f7b-444b-aae3-b0c634622d10/displayicon.png",
                    assetPath = "ShooterGame/Content/Characters/_Core/Roles/Breaker_PrimaryDataAsset"
                )
            ),
            AgentDto(
                abilities = listOf(
                    AbilityDto(
                        displayName = "Seize",
                        displayIcon = "https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/abilities/ability1/displayicon.png",
                        description = "EQUIP a knot of raw fear. FIRE to throw. The knot drops down after a set time. RE-USE to drop the knot early. The knot ruptures on impact, holding nearby enemies in place. Held enemies are Deafened, and Decayed.",
                        slot = "Ability1"
                    ),
                    AbilityDto(
                        displayName = "Haunt",
                        displayIcon = "https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/abilities/ability2/displayicon.png",
                        description = "EQUIP a haunting watcher. FIRE to throw. The watcher drops down after a set time. RE-USE to drop the watcher early. The watcher lashes out on impact, Revealing enemies in its line of sight and creating terror trails to them. Enemies can destroy the watcher.",
                        slot = "Ability2"
                    ),
                    AbilityDto(
                        displayName = "Prowler",
                        displayIcon = "https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/abilities/grenade/displayicon.png",
                        description = "EQUIP a prowler. FIRE to send the prowler forward. HOLD FIRE to steer the prowler towards your crosshair. The prowler will chase down the first enemy or terror trail it sees, and Nearsight the enemy on impact.",
                        slot = "Grenade"
                    ),
                    AbilityDto(
                        displayName = "Nightfall",
                        displayIcon = "https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/abilities/ultimate/displayicon.png",
                        description = "EQUIP the power of nightmare itself. FIRE to unleash a wave of unstoppable nightmare energy. Enemies caught in the wave are Marked by terror trails, Deafened, and Decayed.",
                        slot = "Ultimate"
                    )
                ),
                assetPath = "ShooterGame/Content/Characters/BountyHunter/BountyHunter_PrimaryAsset",
                background = "https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/background.png",
                backgroundGradientColors = listOf("b1414cff", "5589bdff", "18344cff", "66376cff"),
                bustPortrait = "https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/fullportrait.png",
                description = "Turkish bounty hunter Fade unleashes the power of raw nightmare to seize enemy secrets. Attuned with terror itself, she hunts down targets and reveals their deepest fears - before crushing them in the dark.",
                developerName = "BountyHunter",
                displayIcon = "https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/displayicon.png",
                displayIconSmall = "https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/displayiconsmall.png",
                displayName = "Fade",
                fullPortrait = "https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/fullportrait.png",
                fullPortraitV2 = "https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/fullportrait.png",
                isAvailableForTest = true,
                isBaseContent = false,
                isFullPortraitRightFacing = false,
                isPlayableCharacter = true,
                killfeedPortrait = "https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/killfeedportrait.png",
                role = RoleDto(
                    assetPath = "ShooterGame/Content/Characters/_Core/Roles/Breaker_PrimaryDataAsset",
                    description = "Initiators challenge angles by setting up their team to enter contested ground and push defenders away.",
                    displayName = "Initiator",
                    displayIcon = "https://media.valorant-api.com/agents/roles/1b47567f-8f7b-444b-aae3-b0c634622d10/displayicon.png",
                    uuid = "1b47567f-8f7b-444b-aae3-b0c634622d10"
                ),
                uuid = "dade69b4-4f5a-8528-247b-219e5a1facd6"
            ),
            AgentDto(
                abilities = listOf(
                    AbilityDto(
                        displayName = "Flashpoint",
                        displayIcon = "https://media.valorant-api.com/agents/5f8d3a7f-467b-97f3-062c-13acf203c006/abilities/ability1/displayicon.png",
                        description = "EQUIP a Blinding charge. FIRE the charge to set a fast-acting burst through the wall. The charge detonates to Blind all players looking at it.",
                        slot = "Ability1"
                    ),
                    AbilityDto(
                        displayName = "Fault Line",
                        displayIcon = "https://media.valorant-api.com/agents/5f8d3a7f-467b-97f3-062c-13acf203c006/abilities/ability2/displayicon.png",
                        description = "EQUIP a seismic blast. HOLD FIRE to increase the distance. RELEASE to set off the quake, Concussing all players in its zone and in a line up to the zone.",
                        slot = "Ability2"
                    ),
                    AbilityDto(
                        displayName = "Aftershock",
                        displayIcon = "https://media.valorant-api.com/agents/5f8d3a7f-467b-97f3-062c-13acf203c006/abilities/grenade/displayicon.png",
                        description = "EQUIP a fusion charge. FIRE the charge to set a slow-acting burst through the wall. The burst does heavy damage to anyone caught in its area.",
                        slot = "Grenade"
                    ),
                    AbilityDto(
                        displayName = "Rolling Thunder",
                        displayIcon = "https://media.valorant-api.com/agents/5f8d3a7f-467b-97f3-062c-13acf203c006/abilities/ultimate/displayicon.png",
                        description = "EQUIP a Seismic Charge. FIRE to send a cascading quake through all terrain in a large cone. The quake Concusses and knocks up anyone caught in it.",
                        slot = "Ultimate"
                    )
                ),
                assetPath = "ShooterGame/Content/Characters/Breach/Breach_PrimaryAsset",
                background = "https://media.valorant-api.com/agents/5f8d3a7f-467b-97f3-062c-13acf203c006/background.png",
                backgroundGradientColors = listOf("ff9c33ff", "b04621ff", "523a23ff", "44412eff"),
                bustPortrait = "https://media.valorant-api.com/agents/5f8d3a7f-467b-97f3-062c-13acf203c006/fullportrait.png",
                description = "The bionic Swede Breach fires powerful, targeted kinetic blasts to aggressively clear a path through enemy ground. The damage and disruption he inflicts ensures no fight is ever fair.",
                developerName = "Breach",
                displayIcon = "https://media.valorant-api.com/agents/5f8d3a7f-467b-97f3-062c-13acf203c006/displayicon.png",
                displayIconSmall = "https://media.valorant-api.com/agents/5f8d3a7f-467b-97f3-062c-13acf203c006/displayiconsmall.png",
                displayName = "Breach",
                fullPortrait = "https://media.valorant-api.com/agents/5f8d3a7f-467b-97f3-062c-13acf203c006/fullportrait.png",
                fullPortraitV2 = "https://media.valorant-api.com/agents/5f8d3a7f-467b-97f3-062c-13acf203c006/fullportrait.png",
                isAvailableForTest = true,
                isBaseContent = false,
                isFullPortraitRightFacing = false,
                isPlayableCharacter = true,
                killfeedPortrait = "https://media.valorant-api.com/agents/5f8d3a7f-467b-97f3-062c-13acf203c006/killfeedportrait.png",
                role = RoleDto(
                    assetPath = "ShooterGame/Content/Characters/_Core/Roles/Breaker_PrimaryDataAsset",
                    description = "Initiators challenge angles by setting up their team to enter contested ground and push defenders away.",
                    displayName = "Initiator",
                    displayIcon = "https://media.valorant-api.com/agents/roles/1b47567f-8f7b-444b-aae3-b0c634622d10/displayicon.png",
                    uuid = "1b47567f-8f7b-444b-aae3-b0c634622d10"
                ),
                uuid = "5f8d3a7f-467b-97f3-062c-13acf203c006"
            ),
            AgentDto(
                abilities = listOf(
                    AbilityDto(
                        displayName = "Sonic Sensor",
                        displayIcon = "https://media.valorant-api.com/agents/cc8b64c8-4b25-4ff9-6e7f-37b4da43d235/abilities/ability1/displayicon.png",
                        description = "EQUIP a Sonic Sensor. FIRE to deploy. The sensor monitors an area for enemies making sound. It concusses that area if footsteps, weapons fire, or significant noise are detected. This ability can be picked up to be REDEPLOYED.",
                        slot = "Ability1"
                    ),
                    AbilityDto(
                        displayName = "Barrier Mesh",
                        displayIcon = "https://media.valorant-api.com/agents/cc8b64c8-4b25-4ff9-6e7f-37b4da43d235/abilities/ability2/displayicon.png",
                        description = "EQUIP a Barrier Mesh disc. FIRE to throw forward. Upon landing, the disc generates barriers from the origin point that block character movement.",
                        slot = "Ability2"
                    ),
                    AbilityDto(
                        displayName = "GravNet",
                        displayIcon = "https://media.valorant-api.com/agents/cc8b64c8-4b25-4ff9-6e7f-37b4da43d235/abilities/grenade/displayicon.png",
                        description = "EQUIP a GravNet grenade. FIRE to throw. ALT FIRE to lob. The GravNet detonates upon landing, forcing any characters caught within to crouch and move slowly.",
                        slot = "Grenade"
                    ),
                    AbilityDto(
                        displayName = "Annihilation",
                        displayIcon = "https://media.valorant-api.com/agents/cc8b64c8-4b25-4ff9-6e7f-37b4da43d235/abilities/ultimate/displayicon.png",
                        description = "EQUIP a Nanowire Accelerator. FIRE to unleash a pulse of nanowires that captures the first enemy contacted. The cocooned enemy is pulled along a nanowire path and will die if they reach the end, unless they are freed. The nanowire cocoon is destructible.",
                        slot = "Ultimate"
                    )
                ),
                assetPath = "ShooterGame/Content/Characters/Cable/Cable_PrimaryAsset",
                background = "https://media.valorant-api.com/agents/cc8b64c8-4b25-4ff9-6e7f-37b4da43d235/background.png",
                backgroundGradientColors = listOf("bcc2ffff", "4d64c4ff", "221c3dff", "22224bff"),
                bustPortrait = "https://media.valorant-api.com/agents/cc8b64c8-4b25-4ff9-6e7f-37b4da43d235/fullportrait.png",
                description = "Norwegian operative Deadlock deploys an array of cutting-edge nanowire to secure the battlefield from even the most lethal assault. No one escapes her vigilant watch, nor survives her unyielding ferocity.",
                developerName = "Cable",
                displayIcon = "https://media.valorant-api.com/agents/cc8b64c8-4b25-4ff9-6e7f-37b4da43d235/displayicon.png",
                displayIconSmall = "https://media.valorant-api.com/agents/cc8b64c8-4b25-4ff9-6e7f-37b4da43d235/displayiconsmall.png",
                displayName = "Deadlock",
                fullPortrait = "https://media.valorant-api.com/agents/cc8b64c8-4b25-4ff9-6e7f-37b4da43d235/fullportrait.png",
                fullPortraitV2 = "https://media.valorant-api.com/agents/cc8b64c8-4b25-4ff9-6e7f-37b4da43d235/fullportrait.png",
                isAvailableForTest = true,
                isBaseContent = false,
                isFullPortraitRightFacing = false,
                isPlayableCharacter = true,
                killfeedPortrait = "https://media.valorant-api.com/agents/cc8b64c8-4b25-4ff9-6e7f-37b4da43d235/killfeedportrait.png",
                role = RoleDto(
                    assetPath = "ShooterGame/Content/Characters/_Core/Roles/Support_PrimaryDataAsset",
                    description = "Supports control the battlefield by augmenting allies and suppressing enemies.",
                    displayName = "Support",
                    displayIcon = "https://media.valorant-api.com/agents/roles/5ebe5a9c-43d2-b0e6-3ec9-3e59b0b7a1e4/displayicon.png",
                    uuid = "5ebe5a9c-43d2-b0e6-3ec9-3e59b0b7a1e4"
                ),
                uuid = "cc8b64c8-4b25-4ff9-6e7f-37b4da43d235"
            ),
            AgentDto(
                uuid = "f94c3b30-42be-e959-889c-5aa313dba261",
                displayName = "Raze",
                description = "Raze explodes out of Brazil with her big personality and big guns. With her blunt-force-trauma playstyle, she excels at flushing entrenched enemies and clearing tight spaces with a generous dose of \"boom.\"",
                developerName = "Clay",
                displayIcon = "https://media.valorant-api.com/agents/f94c3b30-42be-e959-889c-5aa313dba261/displayicon.png",
                displayIconSmall = "https://media.valorant-api.com/agents/f94c3b30-42be-e959-889c-5aa313dba261/displayiconsmall.png",
                bustPortrait = "https://media.valorant-api.com/agents/f94c3b30-42be-e959-889c-5aa313dba261/fullportrait.png",
                fullPortrait = "https://media.valorant-api.com/agents/f94c3b30-42be-e959-889c-5aa313dba261/fullportrait.png",
                fullPortraitV2 = "https://media.valorant-api.com/agents/f94c3b30-42be-e959-889c-5aa313dba261/fullportrait.png",
                killfeedPortrait = "https://media.valorant-api.com/agents/f94c3b30-42be-e959-889c-5aa313dba261/killfeedportrait.png",
                background = "https://media.valorant-api.com/agents/f94c3b30-42be-e959-889c-5aa313dba261/background.png",
                backgroundGradientColors = listOf("feac45ff", "d64f35ff", "2c5942ff", "2b474bff"),
                assetPath = "ShooterGame/Content/Characters/Clay/Clay_PrimaryAsset",
                isFullPortraitRightFacing = false,
                isPlayableCharacter = true,
                isAvailableForTest = true,
                isBaseContent = false,
                role = RoleDto(
                    uuid = "dbe8757e-9e92-4ed4-b39f-9dfc589691d4",
                    displayName = "Duelist",
                    description = "Duelists are self-sufficient fraggers who their team expects, through abilities and skills, to get high frags and seek out engagements first.",
                    displayIcon = "https://media.valorant-api.com/agents/roles/dbe8757e-9e92-4ed4-b39f-9dfc589691d4/displayicon.png",
                    assetPath = "ShooterGame/Content/Characters/_Core/Roles/Assault_PrimaryDataAsset"
                ),
                abilities = listOf(
                    AbilityDto(
                        slot = "Ability1",
                        displayName = "Blast Pack",
                        description = "INSTANTLY throw a Blast Pack that will stick to surfaces. RE-USE the ability after deployment to detonate, damaging and moving anything hit.",
                        displayIcon = "https://media.valorant-api.com/agents/f94c3b30-42be-e959-889c-5aa313dba261/abilities/ability1/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Ability2",
                        displayName = "Paint Shells",
                        description = "EQUIP a cluster grenade. FIRE to throw the grenade, which does damage and creates sub-munitions, each doing damage to anyone in their range. ALT FIRE to lob. Paint Shells charge resets every two kills.",
                        displayIcon = "https://media.valorant-api.com/agents/f94c3b30-42be-e959-889c-5aa313dba261/abilities/ability2/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Grenade",
                        displayName = "Boom Bot",
                        description = "EQUIP a Boom Bot. FIRE will deploy the bot, causing it to travel in a straight line on the ground, bouncing off walls. The Boom Bot will lock on to any enemies in its frontal cone and chase them, exploding for heavy damage if it reaches them.",
                        displayIcon = "https://media.valorant-api.com/agents/f94c3b30-42be-e959-889c-5aa313dba261/abilities/grenade/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Ultimate",
                        displayName = "Showstopper",
                        description = "EQUIP a rocket launcher. FIRE to shoot a rocket that does massive area damage on contact with anything.",
                        displayIcon = "https://media.valorant-api.com/agents/f94c3b30-42be-e959-889c-5aa313dba261/abilities/ultimate/displayicon.png"
                    )
                )
            ),
            AgentDto(
                uuid = "22697a3d-45bf-8dd7-4fec-84a9e28c69d7",
                displayName = "Chamber",
                description = "Well-dressed and well-armed, French weapons designer Chamber expels aggressors with deadly precision. He leverages his custom arsenal to hold the line and pick off enemies from afar, with a contingency built for every plan.",
                developerName = "Deadeye",
                displayIcon = "https://media.valorant-api.com/agents/22697a3d-45bf-8dd7-4fec-84a9e28c69d7/displayicon.png",
                displayIconSmall = "https://media.valorant-api.com/agents/22697a3d-45bf-8dd7-4fec-84a9e28c69d7/displayiconsmall.png",
                bustPortrait = "https://media.valorant-api.com/agents/22697a3d-45bf-8dd7-4fec-84a9e28c69d7/fullportrait.png",
                fullPortrait = "https://media.valorant-api.com/agents/22697a3d-45bf-8dd7-4fec-84a9e28c69d7/fullportrait.png",
                fullPortraitV2 = "https://media.valorant-api.com/agents/22697a3d-45bf-8dd7-4fec-84a9e28c69d7/fullportrait.png",
                killfeedPortrait = "https://media.valorant-api.com/agents/22697a3d-45bf-8dd7-4fec-84a9e28c69d7/killfeedportrait.png",
                background = "https://media.valorant-api.com/agents/22697a3d-45bf-8dd7-4fec-84a9e28c69d7/background.png",
                backgroundGradientColors = listOf("ffce6fff", "7b4d21ff", "372d2bff", "163555ff"),
                assetPath = "ShooterGame/Content/Characters/Deadeye/Deadeye_PrimaryAsset",
                isFullPortraitRightFacing = false,
                isPlayableCharacter = true,
                isAvailableForTest = true,
                isBaseContent = false,
                role = RoleDto(
                    uuid = "5fc02f99-4091-4486-a531-98459a3e95e9",
                    displayName = "Sentinel",
                    description = "Sentinels are defensive experts who can lock down areas and watch flanks, both on attacker and defender rounds.",
                    displayIcon = "https://media.valorant-api.com/agents/roles/5fc02f99-4091-4486-a531-98459a3e95e9/displayicon.png",
                    assetPath = "ShooterGame/Content/Characters/_Core/Roles/Sentinel_PrimaryDataAsset"
                ),
                abilities = listOf(
                    AbilityDto(
                        slot = "Ability2",
                        displayName = "Rendezvous",
                        description = "EQUIP a teleport anchor. FIRE to place it on the ground. While on the ground and in range of the anchor, REACTIVATE to quickly teleport to the anchor. The anchor can be picked up to be REDEPLOYED.",
                        displayIcon = "https://media.valorant-api.com/agents/22697a3d-45bf-8dd7-4fec-84a9e28c69d7/abilities/ability2/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Grenade",
                        displayName = "Trademark",
                        description = "EQUIP a trap that scans for enemies. FIRE to place it on the ground. When a visible enemy comes in range, the trap counts down and then destabilizes the terrain around them, creating a lingering field that Slows players caught inside of it. The trap can be picked up to be REDEPLOYED.",
                        displayIcon = "https://media.valorant-api.com/agents/22697a3d-45bf-8dd7-4fec-84a9e28c69d7/abilities/grenade/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Ability1",
                        displayName = "Headhunter",
                        description = "ACTIVATE to equip a heavy pistol. ALT FIRE with the pistol equipped to aim down sights.",
                        displayIcon = "https://media.valorant-api.com/agents/22697a3d-45bf-8dd7-4fec-84a9e28c69d7/abilities/ability1/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Ultimate",
                        displayName = "Tour De Force",
                        description = "ACTIVATE to summon a powerful, custom sniper rifle that will kill an enemy with any direct hit to the upper body. ALT FIRE to aim down sights. Killing an enemy creates a lingering field that Slows players caught inside of it.",
                        displayIcon = "https://media.valorant-api.com/agents/22697a3d-45bf-8dd7-4fec-84a9e28c69d7/abilities/ultimate/displayicon.png"
                    )
                ),
            ),
            AgentDto(
                uuid = "601dbbe7-43ce-be57-2a40-4abd24953621",
                displayName = "KAY/O",
                description = "KAY/O is a machine of war built for a single purpose: neutralizing radiants. His power to Suppress enemy abilities dismantles his opponents' capacity to fight back, securing him and his allies the ultimate edge.",
                developerName = "Grenadier",
                displayIcon = "https://media.valorant-api.com/agents/601dbbe7-43ce-be57-2a40-4abd24953621/displayicon.png",
                displayIconSmall = "https://media.valorant-api.com/agents/601dbbe7-43ce-be57-2a40-4abd24953621/displayiconsmall.png",
                bustPortrait = "https://media.valorant-api.com/agents/601dbbe7-43ce-be57-2a40-4abd24953621/fullportrait.png",
                fullPortrait = "https://media.valorant-api.com/agents/601dbbe7-43ce-be57-2a40-4abd24953621/fullportrait.png",
                fullPortraitV2 = "https://media.valorant-api.com/agents/601dbbe7-43ce-be57-2a40-4abd24953621/fullportrait.png",
                killfeedPortrait = "https://media.valorant-api.com/agents/601dbbe7-43ce-be57-2a40-4abd24953621/killfeedportrait.png",
                background = "https://media.valorant-api.com/agents/601dbbe7-43ce-be57-2a40-4abd24953621/background.png",
                backgroundGradientColors = listOf(
                    "4afaffff",
                    "4da6e1ff",
                    "1a1e4bff",
                    "391a61ff"
                ),
                assetPath = "ShooterGame/Content/Characters/Grenadier/Grenadier_PrimaryAsset",
                isFullPortraitRightFacing = false,
                isPlayableCharacter = true,
                isAvailableForTest = true,
                isBaseContent = false,
                role = RoleDto(
                    uuid = "1b47567f-8f7b-444b-aae3-b0c634622d10",
                    displayName = "Initiator",
                    description = "Initiators challenge angles by setting up their team to enter contested ground and push defenders away.",
                    displayIcon = "https://media.valorant-api.com/agents/roles/1b47567f-8f7b-444b-aae3-b0c634622d10/displayicon.png",
                    assetPath = "ShooterGame/Content/Characters/_Core/Roles/Breaker_PrimaryDataAsset"
                ),
                abilities = listOf(
                    AbilityDto(
                        slot = "Grenade",
                        displayName = "FRAG/ment",
                        description = "EQUIP an explosive fragment. FIRE to throw. ALT FIRE to lob. The fragment sticks to the floor and explodes multiple times, dealing near lethal damage at the center with each explosion.",
                        displayIcon = "https://media.valorant-api.com/agents/601dbbe7-43ce-be57-2a40-4abd24953621/abilities/grenade/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Ability1",
                        displayName = "FLASH/drive",
                        description = "EQUIP a flash grenade. FIRE to overhand throw. ALT FIRE to lob a weaker version that explodes quickly. The flash grenade explodes after a short fuse, Blinding anyone in line of sight.",
                        displayIcon = "https://media.valorant-api.com/agents/601dbbe7-43ce-be57-2a40-4abd24953621/abilities/ability1/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Ability2",
                        displayName = "ZERO/point",
                        description = "EQUIP a suppression blade. FIRE to throw. The blade sticks to the first surface it hits, winds up, and Suppresses anyone in the radius of the explosion. Enemies can destroy this blade.",
                        displayIcon = "https://media.valorant-api.com/agents/601dbbe7-43ce-be57-2a40-4abd24953621/abilities/ability2/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Ultimate",
                        displayName = "NULL/cmd",
                        description = "INSTANTLY overload with polarized radianite energy that pulses from KAY/O in a massive radius. Enemies hit with pulses are Suppressed for a short duration. While overloaded, KAY/O gains Combat Stim and can be re-stabilized if downed.",
                        displayIcon = "https://media.valorant-api.com/agents/601dbbe7-43ce-be57-2a40-4abd24953621/abilities/ultimate/displayicon.png"
                    )
                ),
            ),
            AgentDto(
                uuid = "117ed9e3-49f3-6512-3ccf-0cada7e3823b",
                displayName = "Cypher",
                description = "The Moroccan information broker, Cypher is a one-man surveillance network who keeps tabs on the enemy's every move. No secret is safe. No maneuver goes unseen. Cypher is always watching.",
                developerName = "Gumshoe",
                displayIcon = "https://media.valorant-api.com/agents/117ed9e3-49f3-6512-3ccf-0cada7e3823b/displayicon.png",
                displayIconSmall = "https://media.valorant-api.com/agents/117ed9e3-49f3-6512-3ccf-0cada7e3823b/displayiconsmall.png",
                bustPortrait = "https://media.valorant-api.com/agents/117ed9e3-49f3-6512-3ccf-0cada7e3823b/fullportrait.png",
                fullPortrait = "https://media.valorant-api.com/agents/117ed9e3-49f3-6512-3ccf-0cada7e3823b/fullportrait.png",
                fullPortraitV2 = "https://media.valorant-api.com/agents/117ed9e3-49f3-6512-3ccf-0cada7e3823b/fullportrait.png",
                killfeedPortrait = "https://media.valorant-api.com/agents/117ed9e3-49f3-6512-3ccf-0cada7e3823b/killfeedportrait.png",
                background = "https://media.valorant-api.com/agents/117ed9e3-49f3-6512-3ccf-0cada7e3823b/background.png",
                backgroundGradientColors = listOf(
                    "db9b75ff",
                    "4268b3ff",
                    "3f3f6cff",
                    "2b527cff"
                ),
                assetPath = "ShooterGame/Content/Characters/Gumshoe/Gumshoe_PrimaryAsset",
                isFullPortraitRightFacing = true,
                isPlayableCharacter = true,
                isAvailableForTest = true,
                isBaseContent = false,
                role = RoleDto(
                    uuid = "5fc02f99-4091-4486-a531-98459a3e95e9",
                    displayName = "Sentinel",
                    description = "Sentinels are defensive experts who can lock down areas and watch flanks, both on attacker and defender rounds.",
                    displayIcon = "https://media.valorant-api.com/agents/roles/5fc02f99-4091-4486-a531-98459a3e95e9/displayicon.png",
                    assetPath = "ShooterGame/Content/Characters/_Core/Roles/Sentinel_PrimaryDataAsset"
                ),
                abilities = listOf(
                    AbilityDto(
                        slot = "Ability1",
                        displayName = "Cyber Cage",
                        description = "INSTANTLY toss the cyber cage in front of Cypher. ACTIVATE to create a zone that blocks vision and plays an audio cue when enemies pass through it",
                        displayIcon = "https://media.valorant-api.com/agents/117ed9e3-49f3-6512-3ccf-0cada7e3823b/abilities/ability1/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Ability2",
                        displayName = "Spycam",
                        description = "EQUIP a spycam. FIRE to place the spycam at the targeted location. RE-USE this ability to take control of the camera's view. While in control of the camera, FIRE to shoot a marking dart. This dart will Reveal the location of any player struck by the dart. This ability can be picked up to be REDEPLOYED.",
                        displayIcon = "https://media.valorant-api.com/agents/117ed9e3-49f3-6512-3ccf-0cada7e3823b/abilities/ability2/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Grenade",
                        displayName = "Trapwire",
                        description = "EQUIP a trapwire. FIRE to place a destructible and covert tripwire at the targeted location, creating a line that spans between the placed location and the wall opposite. Enemy players who cross a tripwire will be Tethered, Revealed, and Concussed after a short period if they do not destroy the device in time. This ability can be picked up to be REDEPLOYED.",
                        displayIcon = "https://media.valorant-api.com/agents/117ed9e3-49f3-6512-3ccf-0cada7e3823b/abilities/grenade/displayicon.png"
                    ),
                    AbilityDto(
                        slot = "Ultimate",
                        displayName = "Neural Theft",
                        description = "INSTANTLY use on a targeted dead enemy to download information on their team.  After a brief delay, the location of all living enemy players will be Revealed twice.",
                        displayIcon = "https://media.valorant-api.com/agents/117ed9e3-49f3-6512-3ccf-0cada7e3823b/abilities/ultimate/displayicon.png"
                    )
                )
            )
        )
    }

}