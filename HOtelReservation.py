
#for first time no romm is there so it won't be Accepted status
#then added one room
#Creation of room 
#2: Requests are accepted (Size=3)
test1=[
    {
        "input": {
                "startDay": 0,
                "endDay": 5,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test2=[
    {
        "input": {
                "startDay": 7,
                "endDay": 13,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test3=[
    {
        "input": {
                "startDay": 3,
                "endDay": 9,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test4=[
    {
        "input": {
                "startDay": 5,
                "endDay": 7,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test5=[
    {
        "input": {
                "startDay": 6,
                "endDay": 6,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test6=[
    {
        "input": {
                "startDay": 0,
                "endDay": 4,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
#2: Requests are declined (Size=3)
test21=[
    {
        "input": {
                "startDay": 1,
                "endDay": 3,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test22=[
    {
        "input": {
                "startDay": 2,
                "endDay": 5,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test23=[
    {
        "input": {
                "startDay": 1,
                "endDay": 9,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test24=[
    {
        "input": {
                "startDay": 0,
                "endDay": 15,
                "userId": "user1"
        },
        "output": "Declined"
            
    }
    ]
#2: Requests can be accepted after a decline (Size=3)
test31=[
    {
        "input": {
                "startDay": 1,
                "endDay": 3,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test32=[
    {
        "input": {
                "startDay": 0,
                "endDay": 15,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test33=[
    {
        "input": {
                "startDay": 1,
                "endDay": 9,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test34=[
    {
        "input": {
                "startDay": 2,
                "endDay": 5,
                "userId": "user1"
        },
        "output": "Declined"
            
    }
    ]
test35=[
    {
        "input": {
                "startDay": 4,
                "endDay": 9,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
#Complex Requests (Size=2)
test41=[
    {
        "input": {
                "startDay": 1,
                "endDay": 3,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test42=[
    {
        "input": {
                "startDay": 0,
                "endDay": 4,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test43=[
    {
        "input": {
                "startDay": 2,
                "endDay": 3,
                "userId": "user1"
        },
        "output": "Declined"
            
    }
    ]
test44=[
    {
        "input": {
                "startDay": 5,
                "endDay": 5,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test45=[
    {
        "input": {
                "startDay": 4,
                "endDay": 10,
                "userId": "user1"
        },
        "output": "Declined"
            
    }
    ]
test46=[
    {
        "input": {
                "startDay": 10,
                "endDay": 10,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test47=[
    {
        "input": {
                "startDay": 6,
                "endDay": 7,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test48=[
    {
        "input": {
                "startDay": 8,
                "endDay": 10,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
test49=[
    {
        "input": {
                "startDay": 8,
                "endDay": 9,
                "userId": "user1"
        },
        "output": "Accepted"
            
    }
    ]
#1a/1b: Requests outside our planning period are declined (Size=1)
test1000=[
    {
        "input": {
                "startDay": -4,
                "endDay": 2,
                "userId": "user1"
        },
        "output": "Declined"
            
    }
    
    ]

test1001=[
    {
        "input": {
                "startDay": 200,
                "endDay": 400,
                "userId": "user1"
        },
        "output": "Declined"
            
    }
    
    ]
for test in test49:
    import requests
    import json
    
    url = "http://localhost:8080/reservations"
    
    payload = json.dumps(test.get("input"))
    headers = {
      'Content-Type': 'application/json'
    }
    
    response = requests.request("POST", url, headers=headers, data=payload)
    assert test.get("output") == response.text
    
    print(response.text)
    


    


    
