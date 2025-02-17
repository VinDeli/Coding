

# define the rooms
rooms = {
    'Living Room': {
        'West': 'Game Room',
        'South': 'Kitchen',
        'East': 'Master Bedroom',
        'North': 'Bedroom'
    },
    'Game Room': {
        'East': 'Living Room'
    },
    'Kitchen': {
        'North': 'Living Room',
        'East': 'Garage'
    },
    'Garage': {
        'West': 'Kitchen'
    },
    'Master Bedroom': {
        'West': 'Living Room',
        'North': 'Bathroom1'
    },
    'Bathroom1': {
        'South': 'Master Bedroom'
    },
    'Bedroom': {
        'South': 'Living Room'
    },
    'Bathroom2': {
        'West': 'Bedroom'
    },
    'Exit': {}

}
# start the player in the Living Room
current_room = 'Living Room'
game_active = True  # loop condition
# gameplay Loop
while game_active:
    # Display the current room
    print(f"You are currently in the {current_room}.")
    command = input("Command: ").strip().lower()

    if command == 'Exit':
        print("Exiting the Game now. Goodbye!")
        game_active = False  # exit the loop
    elif command in ['north', 'south', 'east', 'west']:
        if command in rooms[current_room]:
            current_room = rooms[current_room][command]
        else:
            print("You can't go that way!")
    else:
        print("Invalid command. Please use 'north', 'south', 'east', 'west', or 'exit'.")

print("Game Over!")
