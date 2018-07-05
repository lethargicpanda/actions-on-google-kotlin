package actions

object MockResponses {
    const val welcome = """{
"user":{
"userId":"APhe68EmFG8L689xcinHdNbpSadP",
"locale":"en-US",
"lastSeen":"2018-05-22T01:38:28Z",
"userStorage":"{\"data\":{}}"
},
"conversation":{
"conversationId":"1526953174329",
"type":"ACTIVE",
"conversationToken":"{\"data\":{}}"
},
"inputs":[
{
"intent":"actions.intent.TEXT",
"rawInputs":[
{
"inputType":"TOUCH",
"query":"Basic Card"
}
],
"arguments":[
{
"name":"text",
"rawText":"Basic Card",
"textValue":"Basic Card"
}
]
}
],
"surface":{
"capabilities":[
{
"name":"actions.capability.MEDIA_RESPONSE_AUDIO"
},
{
"name":"actions.capability.WEB_BROWSER"
},
{
"name":"actions.capability.AUDIO_OUTPUT"
},
{
"name":"actions.capability.SCREEN_OUTPUT"
}
]
},
"isInSandbox":true,
"availableSurfaces":[
{
"capabilities":[
{
"name":"actions.capability.WEB_BROWSER"
},
{
"name":"actions.capability.AUDIO_OUTPUT"
},
{
"name":"actions.capability.SCREEN_OUTPUT"
}
]
}
]
}"""

    const val basicCard = """{
  "user":{
    "userId":"APhe68EmFG8L689xcinHdNbpSadP",
    "locale":"en-US",
    "lastSeen":"2018-05-22T01:38:28Z",
    "userStorage":"{\"data\":{}}"
  },
  "conversation":{
    "conversationId":"1526953174329",
    "type":"ACTIVE",
    "conversationToken":"{\"data\":{}}"
  },
  "inputs":[
    {
      "intent":"actions.intent.TEXT",
      "rawInputs":[
        {
          "inputType":"TOUCH",
          "query":"Basic Card"
        }
      ],
      "arguments":[
        {
          "name":"text",
          "rawText":"Basic Card",
          "textValue":"Basic Card"
        }
      ]
    }
  ],
  "surface":{
    "capabilities":[
      {
        "name":"actions.capability.MEDIA_RESPONSE_AUDIO"
      },
      {
        "name":"actions.capability.WEB_BROWSER"
      },
      {
        "name":"actions.capability.AUDIO_OUTPUT"
      },
      {
        "name":"actions.capability.SCREEN_OUTPUT"
      }
    ]
  },
  "isInSandbox":true,
  "availableSurfaces":[
    {
      "capabilities":[
        {
          "name":"actions.capability.WEB_BROWSER"
        },
        {
          "name":"actions.capability.AUDIO_OUTPUT"
        },
        {
          "name":"actions.capability.SCREEN_OUTPUT"
        }
      ]
    }
  ]
}"""
}