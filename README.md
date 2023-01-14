# Document management system

Document management system is a system that can register, store, and inquire various documents.

## Installation

Use the Github fork/clone or install as zip

```bash
git clone https://github.com/Tublanx/document-management-system
```

## Usage
Development has not been completed yet. I'll add more later.
```java
// Save at mysql with image, document's name, etc.
documentService.save('idcard');

// Move document to another box
documentService.transfer('idcard');

// Delete document
documentService.deleteDoc('idcard');

// Delete box
documentService.deleteBox('idcard');
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.
