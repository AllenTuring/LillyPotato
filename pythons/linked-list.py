class Node(object):
    def __init__(self, data=None, next_node=None):
        self.data = data
        self.next = next_node

linked_list_0 = Node("pipple", None)
linked_list_1 = Node(1, Node(2, Node(3, Node(10, Node(-1, Node("botato", None))))))
linked_list_e = None

def print_elements(head):
	# code here
	# head.next head.data
	# base case
	if (head == None):
		return
	# code
	print(head.data)
	# recursive step
	print_elements(head.next)

def print_elements_loop(head):
	# code here
	# head.next head.data
	# base case
	while (head != None):
		print(head.data)
		head = head.next

def size_loop(head):
	size = 0
	while (head != None):
		size = size + 1
		head = head.next 
	return size

# takes the head of a linked list
# return size
def size(head):
	if (head == None):
		return 0
	return 1 + size(head.next)

# inserts a new node at the end
# returns the list head
def insert_end(head, new_data):
	if head == None: 
		return Node(new_data, None) 
	if head.next == None: 
		head.next = Node(new_data, None)
		return head
	insert_end(head.next, new_data)
	return head

# inserts at a given index
def insert(head, new_data, index):
	if head == None:
		if index == 0:
			return Node(new_data, None)
		else:
			raise IndexError()
	list_head = head
	if index == 0: 
		head = Node(new_data, head)
		return head
	for i in range(index-1):
		head = head.next
	head.next = Node(new_data, head.next)
	return list_head

print("\nLL0:")
print("List of size: %d"%size(linked_list_0))
print_elements(linked_list_0)
print("\nLL1:")
print("List of size: %d"%size(linked_list_1))
print_elements(linked_list_1)
print("\nLL Empty:")
print("List of size: %d"%size(linked_list_e))
print_elements(linked_list_e)

linked_list_1 = insert_end(linked_list_1, "bop")
print("\nLL1:")
print("List of size: %d"%size(linked_list_1))
print_elements(linked_list_1)

linked_list_1 = insert(linked_list_1, "beep", 0)
print("\nLL1:")
print("List of size: %d"%size(linked_list_1))
print_elements(linked_list_1)

