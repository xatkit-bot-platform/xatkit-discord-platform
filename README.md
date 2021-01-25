Xatkit Discord Platform
=====

[![License Badge](https://img.shields.io/badge/license-EPL%202.0-brightgreen.svg)](https://opensource.org/licenses/EPL-2.0)
[![Wiki Badge](https://img.shields.io/badge/doc-wiki-blue)](https://github.com/xatkit-bot-platform/xatkit/wiki/Xatkit-Discord-Platform)

Receive and send messages from [Discord](https://discordapp.com).

The Discord platform is a concrete implementation of the [*ChatPlatform*](https://github.com/xatkit-bot-platform/xatkit-chat-platform).

## Providers

The Discord platform defines the following providers:

| Provider                   | Type  | Context Parameters | Description                                                  |
| -------------------------- | ----- | ------------------ | ------------------------------------------------------------ |
| ChatProvider | Intent | - `chat.channel`: the identifier of the channel that sent the message<br/> - `chat.username`: the name of the user that sent the message<br/> - `chat.rawMessage`: the raw message sent by the user (before NLP processing) | Receive messages from a communication channel and translate them into Xatkit-compatible intents (*inherited from [ChatPlatform](https://github.com/xatkit-bot-platform/xatkit-chat-platform)*) |
| DiscordIntentProvider | Intent | - `discord.channel`: the identifier of the Discord channel that sent the message<br/> - `discord.username`: the name of the Discord user that sent the message<br/> - `discord.rawMessage`: the raw message sent by the user (before NLP processing)<br/> | Receive messages from Discord and translates them into Xatkit-compatible intents. Note that `discord.channel`, `discord.username`, and `discord.rawMessage` contain the same values as `chat.channel`, `chat.username`, and `chat.rawMessage` |

## Actions

| Action | Parameters                                                   | Return                         | Return Type | Description                                                 |
| ------ | ------------------------------------------------------------ | ------------------------------ | ----------- | ----------------------------------------------------------- |
| PostMessage | - `message`(**String**): the message to post<br/> - `channel` (**String**): the identfier of the Discord channel to post the message to | The posted message | String | Posts the provided `message` to the given Discord `channel` (*inherited from [ChatPlatform](https://github.com/xatkit-bot-platform/xatkit-chat-platform)*) |
| Reply | - `message` (**String**): the message to post as a reply | The posted message | String | Posts the provided `message` as a reply to a received message (*inherited from [ChatPlatform](https://github.com/xatkit-bot-platform/xatkit-chat-platform)*) |


## Options

The discord platform supports the following configuration options

| Key                  | Values | Description                                                  | Constraint    |
| -------------------- | ------ | ------------------------------------------------------------ | ------------- |
| `xatkit.discord.token` | String | The [Discord token](https://discordapp.com/developers/docs/intro) used by Xatkit to deploy the bot | **Mandatory** |

**Note**: if the Discord platform is used as a concrete implementation of the [*ChatPlatform*](https://github.com/xatkit-bot-platform/xatkit-chat-platform) the following property must be set in the Xatkit configuration:

```properties
xatkit.platforms.abstract.ChatPlatform = com.xatkit.plugins.discord.platform.DiscordPlatform
```
