def sonSimetricos(root1, root2):
    if root1 is None and root2 is None:
        return True;
    elif ((root1 is None)!=(root2 is None)) or root1!=root2:
        return False;
    else:
        return sonSimetricos(root1.left, root2.right) and sonSimetricos(root1.right, root2.left);

def esSimetrico(root):
    if root is None:
        return True;
    else:
        return sonSimetricos(root.left, root.right);